package com.fsd.common;

public interface Shape {
	
	default void circle() {
		System.out.println("Circle ");
	}
	void triangel();
	void rectangle();

}
