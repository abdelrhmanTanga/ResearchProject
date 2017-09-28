package com.research.serviceimpl.project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.research.dto.project.TasksExpectedOutcomesDto;
import com.research.entity.Tasks;
import com.research.entity.TasksExpectedOutcomes;
import com.research.repositories.BaseRepository;
import com.research.repositories.project.TasksExpectedOutcomesRepo;
import com.research.service.project.TasksExpectedOutcomesService;
import com.research.serviceimpl.BaseServiceImpl;

@Service
public class TasksExpectedOutcomesServiceImpl extends BaseServiceImpl<TasksExpectedOutcomes> implements TasksExpectedOutcomesService{

	@Autowired
	private TasksExpectedOutcomesRepo tasksExpectedOutcomesRepo;
	
	@Override
	public BaseRepository getBaseRepo() {
		return tasksExpectedOutcomesRepo;
	}

	@Override
	public List<TasksExpectedOutcomesDto> save(List<TasksExpectedOutcomesDto> taskOutcomeDTO, Tasks task) {
		List<TasksExpectedOutcomes> expectedOutcomes = new ArrayList<>();
		for (TasksExpectedOutcomesDto outcomeDTO: taskOutcomeDTO){
			TasksExpectedOutcomes expectedOutcome = new TasksExpectedOutcomes();
			expectedOutcome.setExpectation(outcomeDTO.getExpectation());
			expectedOutcome.setTaskId(task);
			expectedOutcomes.add(expectedOutcome);
		}
		expectedOutcomes = (List<TasksExpectedOutcomes>) tasksExpectedOutcomesRepo.save(expectedOutcomes);
		return null;
	}

	
}
