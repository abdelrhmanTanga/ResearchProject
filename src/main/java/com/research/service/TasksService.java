package com.research.service;

import com.research.dto.project.TaskDTO;
import com.research.entity.Tasks;

public interface TasksService extends BaseService<Tasks> {

	public TaskDTO addTask(TaskDTO taskDTO);
}
