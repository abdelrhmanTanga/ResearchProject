package com.research.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.research.dto.TasksDto;
import com.research.service.TasksService;

@CrossOrigin("${angular.url}")
@RestController
@RequestMapping("/task")
public class TasksController {
	@Autowired
	TasksService tasksService;

	public ResponseEntity<?> addtask(TasksDto taskDto) {
		return new ResponseEntity<TasksDto>(tasksService.addTask(taskDto), HttpStatus.OK);
	}

	public ResponseEntity<List<TasksDto>>getAllTasksForProject(Long projectId)
	{
		
		return new ResponseEntity<List<TasksDto>>(tasksService.getTaskForProject(projectId),HttpStatus.OK);
	}

}
