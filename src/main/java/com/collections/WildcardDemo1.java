package com.collections;

import java.util.ArrayList;
import java.util.List;

public class WildcardDemo1 {

	public WildcardDemo1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog());
		addDogs(dogs); // Ok.
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Cat());
		addDogs(animals); // Ok
		List<Object> lists = new ArrayList<Object>();
		animals.add(new Cat());
		addDogs(lists);
		//addAnimals(lists); // Ok
		/*
		 * List<Cat> cats = new ArrayList<Cat>(); cats.add(new Cat()); addDogs(cats);
		 * //Compilation error
		 */
	}

	private static void addDogs(List<? super Dog> dogs) {
		dogs.add(new Dog());
		// dogs.add(new Animal()); //C.E. Not applicable for Animal
		// dogs.add(new Cat());//C.E. Not applicable for Cat
		/*
		 * Iterator ittr = dogs.iterator(); while(ittr.hasNext())
		 * System.out.println(ittr.next());
		 */
		for (Object o : dogs) { // always Object
			System.out.println(o);
		}
	}
}
