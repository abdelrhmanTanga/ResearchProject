package com.research.service;

import java.util.List;

import com.research.dto.TasksExpectedOutcomesDto;
import com.research.entity.Tasks;
import com.research.entity.TasksExpectedOutcomes;

public interface TasksExpectedOutcomesService extends BaseService<TasksExpectedOutcomes> {

	public List<TasksExpectedOutcomesDto> save(List<TasksExpectedOutcomesDto> taskOutcomeDTO,Tasks task);
}
