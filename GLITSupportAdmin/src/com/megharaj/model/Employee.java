package com.megharaj.model;

public class Employee {  private String firstName;
private String lastName;
private String password;
private String email;

// Use parameterized constructor of class Employee, to pass firstName, lastName.

public Employee(String firstName, String lastName) {
	this.firstName = firstName;
	this.lastName = lastName;

}

public String getFirstName() {
	return this.firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return this.lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

}
