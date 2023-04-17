package com.aspire;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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

		Integer[] values = {4,4,3,2,3,2,5};
		// Custom Filter predicate
		isEven(Arrays.asList(values), n-> n%2==0);
		// Custom Map

	}

	public static void isEven(List<Integer> list, Predicate<Integer> p){
		for (Integer val: list) {
			if(p.test(val)){
				System.out.println(val);
			}
		}
	}
}
