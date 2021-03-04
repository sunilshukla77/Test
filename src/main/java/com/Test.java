package com;

public class Test {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.setName("Sunil");
		p.setAge("35");
		p.setUserId("SunilUserId");
		p.setPassword("Pass");
		
		System.out.println(p.toString() +" "+ p.hashCode());
		
		Person p1 = new Person("SunilShukla", "35", "SunilUserId", "Password");
		
		System.out.println(p1.toString() + "\n "+ p1.hashCode() );
		

	}

}
