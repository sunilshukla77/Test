package com.java.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

// Serializable is a Marker Interface for Java Compiler to know that objects can be saved directly in a file :)
class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	String phone;
	String email;
	boolean isPrime;

	public Customer() {

	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", phone=" + phone + ", email=" + email + ", isPrime=" + isPrime + "]";
	}

	public Customer(String name, String phone, String email, boolean isPrime) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.isPrime = isPrime;
	}

}

public class SerializationDeSerialization {

	public static void main(String[] args) {

		// Serialization :)
		/*
		 * try {
		 * 
		 * Customer customer = new Customer("John", "+91 99999 11111",
		 * "john@example.com", true);
		 * 
		 * File file = new File("customer1.txt"); FileOutputStream stream = new
		 * FileOutputStream(file); ObjectOutputStream objectStream = new
		 * ObjectOutputStream(stream);
		 * 
		 * objectStream.writeObject(customer);
		 * 
		 * objectStream.close(); stream.close();
		 * 
		 * System.out.println(customer.name+" Saved:) ");
		 * 
		 * } catch (Exception e) { System.out.println("Some Exception: "+e); }
		 */

		// DeSerialization
		try {

			File file = new File("customer1.txt");
			FileInputStream stream = new FileInputStream(file);
			ObjectInputStream objectStream = new ObjectInputStream(stream);

			Customer cRef = (Customer) objectStream.readObject();
			System.out.println("Customer Details: ");
			System.out.println(cRef);

			objectStream.close();
			stream.close();

		} catch (Exception e) {
			System.out.println("Some Exception: " + e);
		}

	}

}
