package com.aspire;

import java.util.Arrays;
import java.util.Collection;
import java.util.IntSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collector;
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
		
		//Referencing a Stream, Java 8 streams can't be reused.
		Stream<String> st =Stream.of("a","b","c","d","c").filter(e->e.contains("c"));
		Optional<String> anyElement = st.findAny();
		//Optional<String> findFirstElement = anyElement.findFirst();
		System.out.println(anyElement);
		//System.out.println(findFirstElement);
		
		//Stream pipeline->To perform a sequence of operations over the elements of the data source and aggregate their results,
		//we need three parts: the source, intermediate operation(s) and a terminal operation.
				
		Stream<String> oneModifiedStream = Stream.of("abcd","bcda","sunil","bvga").skip(1);
		
		Stream<String> secondModifiedStream = oneModifiedStream.skip(1).map(e->e.substring(2,4));
		
		System.out.println(oneModifiedStream);
		System.out.println(secondModifiedStream);
		
		//Stream Reduction-> reduce() and collect
		
		OptionalInt reduced = IntStream.range(1, 5).reduce((a,b)-> a+b); // 1+2+3+4= 10
		System.out.println(reduced);
		//Reduce(identity ( initial value of accumulator), 
		//accumulator (a function which specifies the logic of the aggregation of elements.),
		//combiner ( a function which aggregates the results of the accumulator.)) 
		// 10+1= 11, 10+2=12, 10+3=13 combine 11+12+13= 36
		int sumval = Arrays.asList(1,2,3).parallelStream().reduce(10, (a,b)->a+b, (a,b)-> {
			System.out.println("Combined value called");
			return a+b;
		});
		
		System.out.println(sumval);
		
		List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
				  new Product(14, "orange"), new Product(13, "lemon"),
				  new Product(23, "bread"), new Product(13, "sugar"));
		
		List<String> productName = productList.stream().map(Product::getProductname).collect(Collectors.toList());
		System.out.println(productName.toString());
		
		String productString = productList.stream().map(Product::getProductname).collect(Collectors.joining(", ", " { ", " } "));
		System.out.println(productString);
		
		Double avarage = productList.stream().collect(Collectors.averagingInt(Product::getId));
		System.out.println(avarage);
		
		//Summary
		IntSummaryStatistics summary = productList.stream().collect(Collectors.summarizingInt(Product::getId));
		System.out.println(summary);
		
		//Sum
		
		Integer sum = productList.stream().collect(Collectors.summingInt(Product::getId));
		System.out.println(sum);
		
		Map<Integer, List<Product>> mapGroup =productList.stream().collect(Collectors.groupingBy(Product::getId));
		System.out.println(mapGroup);
		
		
		// average value
		// sum of all numeric elements 
		// Grouping of stream’s elements 
		// Dividing stream’s elements into groups according to some predicate
		// Custom collector
		
		//flatMap
		//map
		//limit
		//sort
	}

}
