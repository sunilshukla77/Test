package com.aspire;

import java.util.stream.Stream;

public class StreamFilter1 {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("Kicks", "Bricks", "tail", "Oaks");
		stream.filter(str -> str.endsWith("s")).forEach(System.out::println);
	}

}
