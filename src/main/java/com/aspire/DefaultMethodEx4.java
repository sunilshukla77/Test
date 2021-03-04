package com.aspire;

interface A{
	default void hello(){
		System.out.println("Hello from A");
	}
}

interface B{
	default void hello(){
		System.out.println("Hello from B");
	}
}

class C implements A, B{
	public void hello(){
		B.super.hello();
	}
}

public class DefaultMethodEx4 {
	public static void main(String[] args) {
		new C().hello();
	}
}
