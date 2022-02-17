package com.bridgelabz.greetingappdevelopment.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingAppService {
	public String sayGreeting(String name) {
		return "hello..!! " + name;
	}
}
