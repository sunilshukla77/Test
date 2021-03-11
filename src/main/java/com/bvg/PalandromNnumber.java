package com.bvg;

public class PalandromNnumber {

	/**
	 * Default Constructor
	 */
	public PalandromNnumber() {
	}

	/**
	 * @param args main method
	 */
	public static void main(String[] args) {

		int r, sum = 0, temp;
		int n = 4334;
		temp = n;

		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}

		if (temp == sum)
			System.out.println("Palindrome number");
		else
			System.out.println("not palindrom");

	}

}
