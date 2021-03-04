package com.collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class SortDemo4 {
	public static void main(String[] args) {
		List<StringBuffer> names = Arrays.asList(new StringBuffer("Divya"), new StringBuffer("Amol"),
				new StringBuffer("Sheyas"), new StringBuffer("Rohit"));
		
		names.sort((sb1, sb2)-> sb1.toString().compareTo(sb2.toString()));
		
		/*names.forEach(new Consumer<StringBuffer>(){
				@Override
				public void accept(StringBuffer sb){
					System.out.println(sb);
				}
			}
		);*/
		
		//Lambda in Java 8
		names.forEach(sb->System.out.println(sb));
		
		//Method Reference in Java 8
		names.forEach(System.out::println);
	}
}
