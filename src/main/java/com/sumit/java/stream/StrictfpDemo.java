package com.sumit.java.stream;

public class StrictfpDemo {
	/*
	 * By default, the floating-point computations in Java are platform-dependent. 
	 * And so, the floating-point outcome's precision depends on the hardware in-use.
	 * We'll learn how to use strictfp in Java to ensure platform-independent floating-point computations.
	 */
	public strictfp float calculatePercent(int value, int total) {
		return (value *100)/total;
	}
	
	public strictfp float multiply(float value1, float value2) {
		return value1 *value2 ;
	}


	public strictfp float divide(float value1, float value2) {
		return value1/value2 ;
	}
	
	public static void main(String[] args) {
		StrictfpDemo sfp = new StrictfpDemo();
		System.out.println(sfp.calculatePercent(20, 80));
		System.out.println(sfp.divide(3, 10));
		System.out.println(sfp.divide(41, 80));
		System.out.println(sfp.divide(11, 80));
		System.out.println(sfp.multiply(20.5f, 80.333f));
	}

}
