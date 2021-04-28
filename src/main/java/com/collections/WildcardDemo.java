package com.collections;

import java.util.ArrayList;
import java.util.List;

public class WildcardDemo {

	public WildcardDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog());
		animals.add(new Cat());
		readAnimals(animals); // Ok.
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog());
		readAnimals(dogs); // Ok.
		List<Cat> cats = new ArrayList<Cat>();
		cats.add(new Cat());
		readAnimals(cats); // Ok.
	}

	private static void readAnimals(List<? extends Animal> animals) { // allows any subtype of Animal
		//animals.add(new Cat()); //C.E.
		//animals.add(new Dog()); //C.E.
		// Read elements
		for (Animal a : animals) {
			System.out.println(a);
		}
	}

}
