package com.java.rahul;

public class Test {
	
	int a = 5; // Instance variable
	static final int months = 12; //Static variable
	

	public static void main(String args[]) {
		// Non Static
		Test t = new Test(); // create a memory or space
		System.out.println(t.a);
		t.nonStatic();
		//Test.months= 15;
		//Static
		System.out.println(Test.months);
		Test.ststic();
		
		for (int i = 0; i < args.length; i++) { // local variable
			System.out.println(i);
		}
	}
	
	void nonStatic() { 
		System.out.println("nonStatic");
	}

	static void ststic() {
		System.out.println("Static");
	}
}
