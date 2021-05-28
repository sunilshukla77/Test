package com.aspire;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamDistinct {

	public static void main(String[] args) {
		Collection<String> list = Arrays.asList("a", "b", "c", "d", "a","d");
		List<String> distinctElements = list.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctElements);
		
		//Data Array -> int, long, double, char, float Primitive data type.
		//Collection Framwork -> Integer, Float, Cherector, string, employee, 
		//Stream api-> We have create Strema Stream Creation 
				// Stream of Primitives-> IntStream, LongStream, DoubleStream
		
		//Created Empty Stream
		Stream<String> stringStream= Stream.empty();
		
		//Stream Can be collections type like list, set, Collection
		//Convert Collection to Stream
		Stream<String> streamCollection = list.stream();
		
		// Convert Array to Stream
		String[] stringArray = new String[] {"a","b","C","d","b"};
		Stream<String> streamOfArray= Arrays.stream(stringArray);
		
		Stream<String> streamBuild = Stream.<String>builder()
				.add("Sunil")
				.add("BVG")
				.add("test")
				.build();
		
		Stream<Integer> streamIterated = Stream.iterate(40, n-> n+2).limit(20);
		System.out.println(streamIterated.collect(Collectors.toList()));
		
		//Stream of Primitives-> IntStream, LongStream and DoubleStream
		IntStream intStream = IntStream.range(1, 5);
		
		Random random = new Random();
		LongStream stream = random.longs(5);
		stream.forEach(System.out::println);
		
		
		
		/*LongStream stream = LongStream.of(-3L,9L,11L);
		stream.forEach(System.out::println);*/
		
		
		
		
	}

}
