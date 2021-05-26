package com.aspire;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDistinct {

	public static void main(String[] args) {
		Collection<String> list = Arrays.asList("a", "b", "c", "d", "a","d");
		List<String> distinctElements = list.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctElements);
	}

}
