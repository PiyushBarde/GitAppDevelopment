package com.bridgelabz.greetingappdevelopment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.greetingappdevelopment.repository.GreetingRepository;
import com.bridgelabz.greetingappdevelopment.usermodel.UserModel;


@Service
public class GreetingAppService {
	@Autowired
	GreetingRepository repo;
	public String sayGreeting(UserModel user) {
		return "Hello..." + user.getFirstName() + " " + user.getLastName();
	}
	
	public String sayGreeting(String name) {
		return "Hello..!! " + name;
	}
	
	public UserModel getGreeting(UserModel user) {
		repo.save(user);
		return user;
	}
}
