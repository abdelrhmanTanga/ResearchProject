package com.research.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.research.dto.TasksDto;
import com.research.dto.project.TaskDTO;
import com.research.exception.BusinessException;
import com.research.service.TasksService;

@CrossOrigin("${angular.url}")
@RestController
@RequestMapping("/task")
public class TasksController {
	@Autowired
	TasksService tasksService;

	public ResponseEntity<?> addtask(TaskDTO taskDto) {
		return new ResponseEntity<TaskDTO>(tasksService.addTask(taskDto), HttpStatus.OK);
	}

	public ResponseEntity<List<TasksDto>>getAllTasksForProject(Long projectId)
	{
		
		return new ResponseEntity<List<TasksDto>>(tasksService.getTaskForProject(projectId),HttpStatus.OK);
	}

	@RequestMapping(value = "/addTask" ,method = RequestMethod.POST)
	public ResponseEntity<TaskDTO> addTask(@RequestBody TaskDTO taskDTO){
		if (taskDTO == null){
			throw new BusinessException();
		}
		taskDTO = tasksService.addTask(taskDTO);
		ResponseEntity<TaskDTO> response = new ResponseEntity<>(taskDTO, HttpStatus.OK);
		return response;
	}
}
