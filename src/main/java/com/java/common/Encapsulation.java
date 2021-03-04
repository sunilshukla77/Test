package com.java.common;

//https://pub.dev/packages/razorpay_flutter/example
class Employee {
// Data-Hiding (Attributes are Private) -> Encapsulation
	private String name;
	private String email;
	private int salary;

// setter method
	public void setName(String name) {
// Testing/Validation on what data is being entered :)
		if (name.length() == 0) {
			System.out.println("Enter Valid Name");
		} else {
			this.name = name;
		}
	}

	public void setEmail(String email) {
// Testing/Validation on what data is being entered :)
		if (email.length() == 0 || !email.contains("@") || !email.contains(".")) {
			System.out.println("Enter Valid Email");
		} else {
			this.email = email;
		}
	}

	public void setSalary(int salary) {
// Testing/Validation on what data is being entered :)
// we can validate against the position of employee and accordingly set the salary
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getSalary() {
		return salary;
	}

}

public class Encapsulation {

	public static void main(String[] args) {

		Employee eRef = new Employee();

// Direct Access on Attributes may result in something else
// i.e. security will be breached
//eRef.name = "Some Fallon";
//eRef.email = "abc123";
//eRef.salary = 3000000;

		eRef.setName("John Watson");
		eRef.setEmail("john@abc.com");
		eRef.setSalary(30000);

		System.out.println("Employee Data: " + eRef.getName() + " " + eRef.getEmail() + " " + eRef.getSalary());

	}

}
