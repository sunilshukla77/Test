package com.aspire;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachEx1 {
	public static void main(String[] args) {
		List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		
		//Old approach using Iterator
		Iterator<String> ittr = friends.iterator();
		while(ittr.hasNext()){
			String friend = ittr.next();
			System.out.print(friend +" ");
		}
		System.out.println("");
		
		//Enhanced for loop
		for(String friend : friends){
			System.out.print(friend +" ");
		}
		System.out.println("");
		
		//Using forEach() method added to Iterable in Java 8
		friends.forEach(new Consumer<String>() {
			@Override
			public void accept(String friend){
				System.out.print(friend +" ");
			}
		});
		System.out.println("");
		
		//Using forEach() method added to Iterable and Lambda expression Java 8
		friends.forEach(friend-> System.out.print(friend+" "));
		System.out.println("");
		
		
		//Using forEach() method added to Iterable, Lambda expression and Method references in Java 8
		friends.forEach(System.out::println);
	}
}
