package com.bvg;

public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println(divide2Number(5, 0));
	}
public static int divide2Number(int a,int b) {
	int div = 0;
	try {
		div = a/b;
	}catch(ArithmeticException ae) {
		System.out.println("Not Define divided by Zero :" +ae.getCause());
	}catch(Exception e) {
		System.out.println("Unexpected Error or Execption:");
		e.printStackTrace();
	}
	return div;
}
}
