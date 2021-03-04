package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Capitalize each name
public class StreamEx1 {
	public static void main(String[] args) {
		List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		List<String> uppercaseNames = new ArrayList<String>();

		//Imperative style -- older approach
		for (String name : friends) {
			uppercaseNames.add(name.toUpperCase());
		}
		System.out.println(uppercaseNames);
		uppercaseNames.clear();
		
		//Using Lambda, forEach() in Java 8
		friends.forEach(name->uppercaseNames.add(name.toUpperCase()));
		System.out.println(uppercaseNames);
		uppercaseNames.clear();
		
		//Using Lambda, forEach(), map() method in Stream interface in Java 8
		friends.stream()
		.map(name->name.toUpperCase())
		.forEach(name-> uppercaseNames.add(name));
		System.out.println(uppercaseNames);
		uppercaseNames.clear();
		
		//Using Lambda, forEach(), map() method in Stream interface, Method reference in Java 8
		friends.stream()
		.map(String::toUpperCase)
		.forEach(name-> uppercaseNames.add(name));
		System.out.println(uppercaseNames);
	}
}
