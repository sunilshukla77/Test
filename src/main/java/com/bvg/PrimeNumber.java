package com.bvg;

public class PrimeNumber {

	public static void main(String args[]) {

		int m = 0, flag = 0;
		int value= 13;
		m = value / 2;

		if (value == 0 || value == 1) {
			System.out.println(value + " is not prime number");

		} 
		else {
			for (int i = 2; i <= m; i++) {
				if (value % i == 0) {
					System.out.println(value + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(value + " is prime number");
			}
		}
	}
}