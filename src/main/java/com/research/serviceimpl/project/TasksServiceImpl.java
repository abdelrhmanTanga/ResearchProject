package com.research.serviceimpl.project;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.research.dto.project.TaskDTO;
import com.research.dto.project.TasksExpectedOutcomesDto;
import com.research.entity.Lfm;
import com.research.entity.Tasks;
import com.research.repositories.BaseRepository;
import com.research.repositories.project.TaskRepo;
import com.research.repositories.project.TasksRepository;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.research.entity.Tasks;
import com.research.exception.BusinessException;
import com.research.repositories.BaseRepository;
import com.research.service.project.LFMService;
import com.research.service.project.TasksExpectedOutcomesService;
import com.research.service.project.TasksService;
import com.research.serviceimpl.BaseServiceImpl;

@Service
public class TasksServiceImpl extends BaseServiceImpl<Tasks> implements TasksService {

	@Autowired
	TaskRepo taskRepo;
	@Autowired
	DozerBeanMapper mapper;
	@Autowired
	private LFMService lfmService;
	@Autowired
	private TasksExpectedOutcomesService tasksOutcomesService;


	@SuppressWarnings("rawtypes")
	@Override
	public BaseRepository getBaseRepo() {
		// TODO Auto-generated method stub
		return taskRepo;
	}

	@Override
	public TaskDTO addTask(TaskDTO taskDTO) {
		validateDTO(taskDTO);
		Tasks tasks = new Tasks();
		tasks.setCreateDate(taskDTO.getCreationDate());
		tasks.setDuration(taskDTO.getDuration());
		tasks.setEndDate(taskDTO.getEndDate());
		tasks.setName(taskDTO.getName());
		if (taskDTO.getLfmId() != null){
			Lfm lfm = lfmService.findOne(taskDTO.getLfmId());
			tasks.setLfmId(lfm);
		}
		
		tasks.setStartDate(taskDTO.getStartDate());
		tasks = this.save(tasks);
		
		taskDTO.setId(tasks.getId());
		
//		for (TasksExpectedOutcomesDto expectedOutcome : taskDTO.getTaskExpectedOutcomes()){
//			expectedOutcome.setTaskIdLong(tasks.getId());
//		}
		tasksOutcomesService.save(taskDTO.getTaskExpectedOutcomes(), tasks);
		// TODO
		return taskDTO;
	}

	private void validateDTO(TaskDTO taskDTO) {
		if (taskDTO.getEndDate().compareTo(taskDTO.getStartDate()) < 0){
			throw new BusinessException();
		}
	}

	@Override
	public List<TaskDTO> getAllTasks() {
		List<TaskDTO> tasksDtos = new ArrayList<>();
		mapper.map(getAll(), tasksDtos);
		return tasksDtos;
	}

	@Override
	public List<TaskDTO> getTaskForProject(Long projectId) {
		// TODO Auto-generated method stub
		List<TaskDTO> tasksDtos = new ArrayList<>();
		lfmService.getLFMByProjectid(projectId).getTasksCollection();
		mapper.map(lfmService.getLFMByProjectid(projectId).getTasksCollection(), tasksDtos);
		return tasksDtos;
	}

	@Override
	public void deleteTask(Long taskId) {
		// TODO Auto-generated method stub

	}
}
