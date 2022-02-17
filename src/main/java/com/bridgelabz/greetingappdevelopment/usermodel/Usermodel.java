package com.bridgelabz.greetingappdevelopment.usermodel;

public class Usermodel {
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	
	public Usermodel() {
	}

	public Usermodel(String firstName, String lastName) {
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
