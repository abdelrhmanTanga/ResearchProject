package com.research.service.project;

import java.util.List;

import com.research.dto.project.TasksExpectedOutcomesDto;
import com.research.entity.Tasks;
import com.research.entity.TasksExpectedOutcomes;
import com.research.service.BaseService;

public interface TasksExpectedOutcomesService extends BaseService<TasksExpectedOutcomes> {

	public List<TasksExpectedOutcomesDto> save(List<TasksExpectedOutcomesDto> taskOutcomeDTO,Tasks task);
}
