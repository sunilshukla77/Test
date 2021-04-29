/**
 * 
 */
package com.fsd.common;

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
	}
	
	
	private static void addressP() {
		System.out.println("UK");
	}
	
	private void addressK() {
		System.out.println("USA");
		
	}

}
