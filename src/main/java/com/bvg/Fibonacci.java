package com.bvg;

public class Fibonacci {
	
//Output=  0,1, 1,2,3,5,8,13,21,34
	
	public static void main(String[] args) {
		int n1 = 0, n2 = 1;
		System.out.print(n1  +  " "  + n2);

		for (int i = 2; i < 10; ++i){
			int temp = n1 + n2;
			System.out.print(" " + temp);
			n1 = n2;
			n2 = temp;
		}

	}
}