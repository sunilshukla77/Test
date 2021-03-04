package com.aspire;

interface Vehicle{
	default public void disp(){
		System.out.println("I am vehicle");
	}
}

class Car implements Vehicle{
	/*public void disp(){
		System.out.println("I am car");
	}*/
}

public class DefaultMethodEx3 {
	public static void main(String[] args) {
		Car obj = new Car();
		obj.disp();
	}
}
