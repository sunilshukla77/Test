package com.aspire;

import java.util.Arrays;
import java.util.List;

public class MethodRefEx1 {
	public static void main(String[] args) {
		List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		
		//Lambda approach
		friends.forEach(friend-> System.out.println(friend));
		
		//Method reference approach
		friends.forEach(System.out::println);
	}
}
