package com.bridgelabz.greetingappdevelopment.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/start")
public class GreetingController {
	
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(value = "name",defaultValue = "world") String name) {
		return "Hello..!!! " + name;
	}
	
	@PostMapping("/post/{name}")
	public String greeting1(@PathVariable String name) {
		return "Hello..!!! " + name;
	}	
}
