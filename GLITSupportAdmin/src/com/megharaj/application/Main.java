package com.megharaj.application;



import java.util.Scanner; // importing Scanner class from java.util.

import com.megharaj.credinitalservices.*;
import com.megharaj.model.*;

public class Main{

public static void main(String args[]) 
{
	// TODO Auto-generated method stub
	String FirstName;
	String LastName;
	int choice = 0;
	String Dept = null;
	final String Company = "greatlearning";
	String email;
	String pswd;

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First Name");
	FirstName = sc.next();

	System.out.println("Enter Last Name");
	LastName = sc.next();
	Scanner dep = new Scanner(System.in);

	// Determine the department (Technical, Admin, Human Resource, Legal)

	do {
		System.out.println("Please enter department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		choice = dep.nextInt();
		switch (choice) {
		case 1:
			Dept = "tech";
			break;
		case 2:
			Dept = "admin";
			break;
		case 3:
			Dept = "hr";
			break;
		case 4:
			Dept = "legal";
			break;
		default:
			choice = 0;
		}
	} while (choice == 0);

	Employee emp = new Employee(FirstName, LastName);
	CredintialServices cs = new CredintialServices();
	email = cs.generateEmail(FirstName, LastName, Dept, Company);
	pswd = cs.generatePassword();
	emp.setEmail(email);
	emp.setPassword(pswd);
	cs.showCredentials(emp);
	sc.close();
	dep.close();

}

}