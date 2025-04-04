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
	
	@GetMapping("/dashboard")
	public String dashboard() {
		return "Welcome to Dashboard";
	}
	
	@GetMapping("/register")
	public String register() {
		return "register for the users";
	}
	
	@GetMapping("/login")
	public String login() {
		return "register for the users";
	}
}
