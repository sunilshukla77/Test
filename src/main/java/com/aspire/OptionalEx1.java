package com.aspire;

import java.util.Optional;

public class OptionalEx1 {
	public static void main(String[] args) {
		Integer value1 = null;
		Integer value2 = new Integer(10);

		//System.out.println(value1 + value2); //null pointer exception
		
		int sum = Optional.ofNullable(value1).orElse(new Integer(0)) + Optional.ofNullable(value2).orElse(new Integer(0));
		System.out.println("The result:"+sum);
	}
}
