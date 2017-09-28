package com.research.controllers.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.research.dto.project.TaskDTO;
import com.research.exception.BusinessException;
import com.research.service.project.TasksService;

@Controller
@CrossOrigin("${angular.url}")
@RequestMapping(value = "/Task")
public class TaskController {

	@Autowired
	private TasksService tasksService;

	public ResponseEntity<?> addtask(TaskDTO taskDto) {
		return new ResponseEntity<TaskDTO>(tasksService.addTask(taskDto),
				HttpStatus.OK);

	}

	@RequestMapping(path = "getAllForProject", method = RequestMethod.GET)
	public ResponseEntity<List<TaskDTO>> getAllTasksForProject(
			@RequestParam("id") Long projectId) {
		return new ResponseEntity<List<TaskDTO>>(
				tasksService.getTaskForProject(projectId), HttpStatus.OK);
	}

	@RequestMapping(value = "/addTask", method = RequestMethod.POST)
	public ResponseEntity<TaskDTO> addTask(@RequestBody TaskDTO taskDTO) {
		if (taskDTO == null) {
			throw new BusinessException();
		}
		taskDTO = tasksService.addTask(taskDTO);
		ResponseEntity<TaskDTO> response = new ResponseEntity<>(taskDTO,
				HttpStatus.OK);
		return response;
	}
}
