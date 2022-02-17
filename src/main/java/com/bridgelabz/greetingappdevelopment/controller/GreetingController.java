package com.bridgelabz.greetingappdevelopment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.greetingappdevelopment.service.GreetingAppService;
import com.bridgelabz.greetingappdevelopment.usermodel.Usermodel;





@RestController
@RequestMapping("/start")
public class GreetingController {
	
	@Autowired
	GreetingAppService service;
	
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(value = "userPassedName",defaultValue = "world") String userPassedName) {
		String greeting = service.sayGreeting(userPassedName);
		return greeting;
	}
	
	@PostMapping("/post")
	public String greeting1(@RequestBody Usermodel user) {
		return 	service.sayGreeting(user);
	}
}
