package com.research.service;

import java.util.List;

import com.research.dto.TasksDto;
import com.research.entity.Tasks;

public interface TasksService extends BaseService<Tasks> {
	TasksDto addTask(TasksDto task);

	List<TasksDto> getAllTasks();

	List<TasksDto> getTaskForProject(Long projectId);
	void deleteTask(Long taskId);
	

}
