package com.bvg;

public class PrimeNumber {

	public static void main(String args[]) {
		int m, flag = 0;
		int value = 17;
		m = value / 2;

		if (value == 0 || value == 1) {
			System.out.println(value + " is not prime number");
		} else {
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


// Prime no = 0 and 1 is not prime no, if it is factor greater than 2 number

//if it is divisible 1 and itself means only 2 factor that is know as prime number.

//Even number can not be prime no
 
