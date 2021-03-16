package com.bvg;

public class TestDemo {
	
	private String name; // Variable 
	private String ssn;
	private String idNum;
	
	protected String defaultvalue = "Test Not Static";
	protected static String staticVariable = "Static Variable";
	private static float b;
	private static String rString;
	private static int testInt;
	private static InterfaceDemo id;
	
	public TestDemo(){  // Default Constructor
		
	}
	
	public TestDemo(String personName, String ssn){ // Parameterise Constructor 
		this.setName(personName);
		this.setSsn(ssn);
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
		setB(30L);
		char c= 'r';
		String test= "50";
		
		System.out.println(Weekdays.MONDAY);
		String aString = String.valueOf(a);
		System.out.println(aString);
		
		setrString(String.valueOf(c));
		
		setTestInt(Integer.parseInt(test));
		
		// Encapsulation
		Login l1 = new Login();
		l1.setUserId("Bhagyesh");
		l1.setPassword("Test");
		
		
		System.out.println(" User id "+ l1.getUserId());
		System.out.println(" Password "+ l1.getPassword());
		
	}
	
	public int addition(int a, int b) {  //Non static method
		return a+b;
	}
	
	
	public static int substration(int a, int b) { //Static method
		return a-b;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getIdNum() {
		return idNum;
	}

	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

	public static float getB() {
		return b;
	}

	public static void setB(float b) {
		TestDemo.b = b;
	}

	public static String getrString() {
		return rString;
	}

	public static void setrString(String rString) {
		TestDemo.rString = rString;
	}

	public static int getTestInt() {
		return testInt;
	}

	public static void setTestInt(int testInt) {
		TestDemo.testInt = testInt;
	}

	public static InterfaceDemo getId() {
		return id;
	}

	public static void setId(InterfaceDemo id) {
		TestDemo.id = id;
	}

}
