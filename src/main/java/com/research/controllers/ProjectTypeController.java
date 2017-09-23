package com.research.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.research.dto.ProjectTypeDto;

@RestController
@RequestMapping("/projecttype")
public class ProjectTypeController {

	@RequestMapping(path = "/getAll")
	public ResponseEntity<?> getAll() {
		return null;
	}
	@RequestMapping(path="/add",method=RequestMethod.POST)
	public ResponseEntity<?> addProject()
	{
		return null;}
}
