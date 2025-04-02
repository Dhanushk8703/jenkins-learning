package com.jenkins.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/")
	public String display() {
		return "Hello World";
	}
	
	@GetMapping("/Home")
	public String displayHome() {
		return "Welcome to Home";
	}
}
