package com.megharaj.credinitalservices;

import java.util.Random; 

import com.megharaj.model.*;

public class CredintialServices{ //password
	
	private String Email;
	private String password;

	// Generate an email with the following syntax
	// firstNamelastName@department.company.com

	public String generateEmail(String FirstName, String LastName, String Department, String Company) {
		return this.Email = FirstName.toLowerCase() + LastName.toLowerCase() + "@" + Department + "." + Company
				+ ".com";

	}

	// Generate a random password which will contain (number, capital letter, small
	// letter & special character)

	public String generatePassword() {
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "1234567890";
		String special = "!@#$%^&*()";
		String psswrd = "";
		Random random = new Random();
		psswrd += upper.charAt(random.nextInt(upper.length()));
		psswrd += upper.charAt(random.nextInt(upper.length()));
		psswrd += lower.charAt(random.nextInt(lower.length()));
		psswrd += lower.charAt(random.nextInt(lower.length()));
		psswrd += numbers.charAt(random.nextInt(numbers.length()));
		psswrd += numbers.charAt(random.nextInt(numbers.length()));
		psswrd += special.charAt(random.nextInt(special.length()));
		psswrd += special.charAt(random.nextInt(special.length()));

		return this.password = psswrd;
	}

//Display the generated credentials
	public void showCredentials(Employee employee) {
		System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows ");
		System.out.println("Email ID ---> " + Email);
		System.out.println("Password ---> " + generatePassword());

	}

}
