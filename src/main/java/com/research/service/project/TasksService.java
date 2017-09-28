package com.research.service.project;


import com.research.dto.project.TaskDTO;
import com.research.entity.Tasks;

import java.util.List;

import com.research.entity.Tasks;
import com.research.service.BaseService;

public interface TasksService extends BaseService<Tasks> {
	TaskDTO addTask(TaskDTO task);

	List<TaskDTO> getAllTasks();

	List<TaskDTO> getTaskForProject(Long projectId);
	void deleteTask(Long taskId);
	


}
