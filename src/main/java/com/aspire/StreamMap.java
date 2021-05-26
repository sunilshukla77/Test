package com.aspire;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {

	public static void main(String[] args) {
		System.out.println("After applying the Stream " + "The function is : ");
		//List<Integer> list = Arrays.asList(5,7,9,13,19);
		List<String> list = Arrays.asList("Bhagyesh" , "Jay", "ved", "ken", "rev");
	//	list.stream().map(number -> number *3).forEach(System.out::println);
		List<String> answer = list.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(answer);
	}

}
