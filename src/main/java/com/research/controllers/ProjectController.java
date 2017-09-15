package com.research.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.research.dto.ProjectDto;

@RestController
@CrossOrigin("${angular.url}")
@RequestMapping("/project")
public class ProjectController {
	
	@CrossOrigin
	@RequestMapping(path = "/selectOne")
	public ResponseEntity<?> sayHello() {
		ProjectDto projectDto=new ProjectDto();
		projectDto.setTitle("title");
		projectDto.setType("type");
return new ResponseEntity<ProjectDto>(projectDto,HttpStatus.OK);
	}
}
