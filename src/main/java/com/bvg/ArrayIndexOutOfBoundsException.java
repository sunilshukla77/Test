package com.bvg;

public class ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
		try {
			int array[] = new int[] { -1,4, 1, 2, 6, 7 };
			// accessing element at index 2
			System.out.println("The element at index 2 is " + array[2]);
			// accessing element at index -1
			// this will throw the
			// ArrayIndexOutOfBoundsException
			System.out.println("The element at index -1 is " + array[-1]);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
