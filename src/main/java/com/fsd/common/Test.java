package com.fsd.common;

import com.collections.Person;

public class Test {
	
	public static void main(String args[]) {
		
		Test t= new Test();
		int sum = t.sum(10, 80);
		int mul= t.mult(2, 7);
		
		Person p= new Person();
		p.setName("Prashant");
		p.setAge("20");
		p.setSsn("123456789");
		p.setCity("CL");
		
		System.out.println("Sum of 10 and 80: " + sum);
		System.out.println("Multiplication of 2 and 7 :" + mul);
		
		
		System.out.println("Name : " +p.getName());
		System.out.println("Age : " +p.getAge());
		System.out.println("SSN No : "+ p.getSsn());
		System.out.println("City : " + p.getCity());
		
		
	}
	
	int sum(int a, int b) {
		return a+b;
	}
	
	int mult(int a, int b) {
		return a*b;
	} 

}
