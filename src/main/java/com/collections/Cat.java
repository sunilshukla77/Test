package com.collections;

public class Cat extends Animal{

	String name; 
	
	public Cat() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void AnimalName() {
		System.out.println("Animal class");
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
}
