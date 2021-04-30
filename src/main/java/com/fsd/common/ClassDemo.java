/**
 * 
 */
package com.fsd.common;

import com.bvg.Weekdays;

/**
 * @author Sunil Shukla
 *
 */
public class ClassDemo {
	
	private static String prasant = new String("Prashant");
	
	private String kamal= new String("Kamal");

	/**
	 * Default Constructor
	 */
	public ClassDemo() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Static variable and method
		System.out.println(ClassDemo.prasant);
		ClassDemo.addressP();
		
		//Non Static
		ClassDemo nameKamal = new ClassDemo();
		System.out.println(nameKamal.kamal);
		nameKamal.addressK();
	
		nameKamal= null;
		
		
		System.out.println(Weekdays.FRIDAY);
		
		int a , b;
     	a = 10;
     	b = (a==1)?20:30; 
		System.out.println("Value of b is : "+  b );
      	b = (a ==10)?20:30;
		System.out.println("Value of b is : "+ b );
		
		String name ="Prashant";
		if(name instanceof String) {
			System.out.println("String Class");
		}


	}
	
	
	private static void addressP() {
		System.out.println("UK");
	}
	
	private void addressK() {
		System.out.println("USA");
		
	}

}
