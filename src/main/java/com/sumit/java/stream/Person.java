package com.sumit.java.stream;

public interface Person {
	void employed(String person);
	void Student(String person);
	public default void livingthing(String person) {
		System.out.println("He is living thng");
	}

}
