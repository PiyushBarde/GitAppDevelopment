package com.bridgelabz.greetingappdevelopment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.greetingappdevelopment.usermodel.UserModel;

public interface GreetingRepository extends JpaRepository<UserModel, Integer> {

}
