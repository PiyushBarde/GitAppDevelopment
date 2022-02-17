package com.bridgelabz.greetingappdevelopment.service;

import org.springframework.stereotype.Service;

import com.bridgelabz.greetingappdevelopment.usermodel.Usermodel;


@Service
public class GreetingAppService {
	public String sayGreeting(Usermodel user) {
		return "Hello..." + user.getFirstName() + " " + user.getLastName();
	}
	
	public String sayGreeting(String name) {
		return "Hello..!! " + name;
	}
}
