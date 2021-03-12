package com.bvg;

public class TestDemo {
	
	private String name; // Variable 
	private String ssn;
	
	protected String defaultvalue = "Test Not Static";
	protected static String staticVariable = "Static Variable";
	
	public TestDemo(){  // Default Constructor
		
	}
	
	public TestDemo(String personName, String ssn){ // Parameterise Constructor 
		this.name= personName;
		this.ssn= ssn;
	}
	
	public static void main(String args[]) {
		TestDemo td= new TestDemo(); // Instance of class
		int nonStaticResult= td.addition(6,8);
		System.out.println(nonStaticResult);   // Non static
		
		System.out.println(TestDemo.substration(10, 6)); // Static
		
		System.out.println(td.defaultvalue);
		
		System.out.println(TestDemo.staticVariable);
		
		for (int i = 0; i < 5; i++) { // Local variable
			System.out.println(i);
		}
		
		final int i =20; // Scope is in method
		System.out.println("Final "+i);
		
		int a= 20;
		float b = 30L;
		char c= 'r';
		String test= "50";
		
		System.out.println(Weekdays.MONDAY);
		String aString = String.valueOf(a);
		System.out.println(aString);
		
		String rString = String.valueOf(c);
		
		int testInt = Integer.parseInt(test);
		
		// Encapsulation
		Login l1 = new Login();
		l1.setUserId("Bhagyesh");
		l1.setPassword("Test");
		
		InterfaceDemo id = new InterfaceDemoImpl();
		
		System.out.println(" User id "+ l1.getUserId());
		System.out.println(" Password "+ l1.getPassword());
		
	}
	
	public int addition(int a, int b) {  //Non static method
		return a+b;
	}
	
	
	public static int substration(int a, int b) { //Static method
		return a-b;
	}

}
