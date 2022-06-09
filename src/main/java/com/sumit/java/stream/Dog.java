package com.sumit.java.stream;

public class Dog extends Animal {

	@Override
	public void eatable(String name) {
		System.out.println("Dog is eatable animal");
	}
	
	public static void main(String args[]) {

		//Animal a = new Animal(4,"Water" );// Instance of class or creating object
		//a.eatable("Elephant");
		Animal.walkable("Camel");
	}


}
