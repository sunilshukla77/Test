package com.aspire;

import java.util.stream.Stream;

public class StreamFilter {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("Bhagyesh", "LION", "seeker", "KEepr");
		stream.filter(str -> Character.isUpperCase(str.charAt(1))).forEach(System.out::println);
	}
}
