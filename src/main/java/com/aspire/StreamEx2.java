package com.aspire;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//filter names start with 'N'
public class StreamEx2 {
	public static void main(String[] args) {
		List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		List<String> startsWithN = new ArrayList<String>();

		// Imperative style -- older approach
		for (String name : friends) {
			if (name.startsWith("N")) {
				startsWithN.add(name);
			}
		}
		System.out.println(startsWithN);
		startsWithN.clear();

		// Using filter() and Lambda in Java 8
		Stream<String> newStream = friends.stream().filter(name-> name.startsWith("N"));
		startsWithN = newStream.collect(Collectors.toList());
		
		//startsWithN = friends.stream().filter(name->name.startsWith("N")).collect(Collectors.toList());
		
		System.out.println(startsWithN);
		
	}
}
