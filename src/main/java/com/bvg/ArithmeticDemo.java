package com.bvg;

public class ArithmeticDemo {

	public static void main(String[] args) {

		try {
			int a= 5/0;
			System.out.println(a);
		}
		catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
			ae.printStackTrace();
		}
	}

}
