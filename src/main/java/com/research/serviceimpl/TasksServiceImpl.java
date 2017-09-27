package com.research.serviceimpl;

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
	public TasksDto addTask(TasksDto taskDto) {
		Tasks tasks = mapper.map(taskDto, Tasks.class);
		// TODO check project
		return mapper.map(save(tasks), TasksDto.class);

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
