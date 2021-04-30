package com.fsd.common;

import com.collections.Person;
import com.srikana.collection.Employer;

public class Test {
	
	public static void main(String args[]) {
		
		Test t= new Test();
		int sum = t.sum(10, 80);
		int mul= t.mult(2, 7);
		
		Person prashant= new Person();
		prashant.setName("Prashant");
		prashant.setAge("20");
		prashant.setSsn("123456789");
		prashant.setCity("CL");
		
		Person Kamal= new Person();
		Kamal.setName("Kamal");
		Kamal.setAge("30");
		Kamal.setSsn("123456789");
		Kamal.setCity("UK");
		
		System.out.println("Sum of 10 and 80: " + sum);
		System.out.println("Multiplication of 2 and 7 :" + mul);
		
		Employer e= new Employer("Kamal", "12346", "UK");
		
		
		if(prashant instanceof Person) {
			System.out.println("Name : " +prashant.getName());
			System.out.println("Age : " +prashant.getAge());
			System.out.println("SSN No : "+ prashant.getSsn());
			System.out.println("City : " + prashant.getCity());
			
		}else {
			
			System.out.println(e.toString());
		}
		
		
		String mulStr = Integer.toString(mul);
		System.out.println(mulStr);
		float a = 123.50f;
		String aStr = String.valueOf(a);
		System.out.println(aStr);
		long l = Long.valueOf(mulStr);
		System.out.println(l);
		
		
	}
	
	int sum(int a, int b) {
		return a+b;
	}
	
	int mult(int a, int b) {
		return a*b;
	} 

}
