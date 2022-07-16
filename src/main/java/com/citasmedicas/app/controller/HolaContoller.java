package com.citasmedicas.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hola")
public class HolaContoller {
	
	@CrossOrigin
	@GetMapping
	public ResponseEntity<?> create() {
		
		return ResponseEntity.status(HttpStatus.OK).body("hello world");
	}
}
