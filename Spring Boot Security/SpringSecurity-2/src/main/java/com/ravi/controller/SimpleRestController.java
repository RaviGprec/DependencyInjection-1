package com.ravi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {
	
	@GetMapping("/user")
	String greetUser() {
		return "Hey User!!";
	}
	
	@GetMapping("/admin")
	String greetAdmin() {
		return "Hey Admin";
	}
	
	@GetMapping("/home")
	String homePage() {
		return ("<h1>Welcome to Home Page of Simple Spring Boot Security App!! </h1>");
	}
	
}
