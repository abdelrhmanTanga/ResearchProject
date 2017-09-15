package com.research.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class test {
	
	@CrossOrigin
	@RequestMapping(path = "test")
	public ResponseEntity<?> sayHello() {
return new ResponseEntity<String>("{name:test}",HttpStatus.OK);
	}
}
