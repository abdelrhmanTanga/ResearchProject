package com.research.serviceimpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.research.dto.project.TaskDTO;
import com.research.entity.Lfm;
import com.research.entity.Tasks;
import com.research.repositories.BaseRepository;
import com.research.repositories.project.TasksRepository;
import com.research.service.TasksService;
import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.research.dto.TasksDto;
import com.research.entity.Tasks;
import com.research.repositories.BaseRepository;
import com.research.repositories.TaskRepo;
import com.research.service.TasksService;

public class TasksServiceImpl extends BaseServiceImpl<Tasks> implements TasksService {

	@Autowired
	TaskRepo taskRepo;
	@Autowired
	DozerBeanMapper mapper;

	@SuppressWarnings("rawtypes")
	@Override
	public BaseRepository getBaseRepo() {
		// TODO Auto-generated method stub
		return taskRepo;
	}

	@Override
	public TaskDTO addTask(TaskDTO taskDTO) {
		Tasks tasks = new Tasks();
		tasks.setCreateDate(taskDTO.getCreationDate());
		tasks.setDuration(taskDTO.getDuration());
		tasks.setEndDate(taskDTO.getEndDate());
		tasks.setName(taskDTO.getName());
//		Lfm lfm = new Lfm();
//		lfm.setId(taskDTO.getId());
//		tasks.setLfmId(lfm);
		tasks.setStartDate(new Date());
		tasks = this.save(tasks);
		this.save(tasks);
		taskDTO.setId(tasks.getId());
		// TODO
		return taskDTO;
	}

	@Override
	public List<TasksDto> getAllTasks() {
		List<TasksDto> tasksDtos = new ArrayList<>();
		mapper.map(getAll(), tasksDtos);
		return tasksDtos;
	}

	@Override
	public List<TasksDto> getTaskForProject(Long projectId) {
		// TODO Auto-generated method stub
	
		return null;
	}

	@Override
	public void deleteTask(Long taskId) {
		// TODO Auto-generated method stub

	}
}
