package com.aspire;

import java.util.stream.Stream;

public class StreamFilter {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("Bhagyesh", "LION", "Seeker", "KEepr");
		stream.filter(str -> Character.isUpperCase(str.charAt(0))).forEach(System.out::println);
	}
}
