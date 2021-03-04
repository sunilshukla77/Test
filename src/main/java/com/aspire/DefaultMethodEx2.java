package com.aspire;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DefaultMethodEx2 {
	public static void main(String[] args) {
		List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

		// Old approach using Iterator
		Iterator<String> ittr = friends.iterator();
		while (ittr.hasNext()) {
			String friend = ittr.next();
			System.out.print(friend + " ");
		}
		System.out.println("");
		
		//Using forEach() default method in Java 8
		friends.forEach(friend->System.out.print(friend+" "));
	}
}
