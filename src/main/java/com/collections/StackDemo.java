package com.collections;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> s=new Stack<String>();
		s.push("A");
		s.push("B");
		s.push("C");
		s.forEach(System.out::println);
		System.out.println("------------");
		
		s.pop();
		s.forEach(System.out::println);
	}
}
