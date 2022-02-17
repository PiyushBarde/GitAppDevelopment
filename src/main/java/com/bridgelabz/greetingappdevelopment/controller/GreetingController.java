package com.bridgelabz.greetingappdevelopment.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.greetingappdevelopment.service.GreetingAppService;



@RestController
@RequestMapping("/start")
public class GreetingController {
	
	@Autowired
	GreetingAppService service;
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(value = "name",defaultValue = "world") String name) {
		String greeting = service.sayGreeting(name);
		return greeting;
	}
	
	@PostMapping("/post/{name}")
	public String greeting1(@PathVariable String name) {
		String greeting = service.sayGreeting(name);
		return greeting;
	}	
}
