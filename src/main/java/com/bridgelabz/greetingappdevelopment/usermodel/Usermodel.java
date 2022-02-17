package com.bridgelabz.greetingappdevelopment.usermodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class UserModel {
	@Id
	@GeneratedValue
	private Integer id;
	private String firstName;
	private String lastName;
	public UserModel(UserModel user) {
		this.id = user.id;
		this.firstName = user.firstName;
		this.lastName = user.lastName;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public UserModel() {
	}

	public UserModel(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
