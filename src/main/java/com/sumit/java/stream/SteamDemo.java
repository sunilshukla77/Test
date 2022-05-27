package com.sumit.java.stream;

public class SteamDemo {
	
	static int i = 800023000;  //Static Variable
	
	long l= 8123412342344234234l; // Instance Variable

	public static void main(String[] args) throws Throwable {
		byte by = 127; //Local variable
		short st= 828;
		
		Integer in= i;
		
		
		float fl = 1212343.23f;
		char ch = '1';
		boolean b= false;
		
		//Array: collection of similar type of data
		int[] arrayInt= {1,2,3,4,5,20,15,30};
		
		for(int i: arrayInt) {
			if(i>=5) {
				System.out.print("\t"+ i);
			}
		}
		
		
		SteamDemo steamDemo= new SteamDemo(); // Created instance
			
		System.out.println("\n Byte "+ by);
		System.out.println("Static int "+ SteamDemo.i);
		
		System.out.println("Instance long "+ steamDemo.l);
		
		System.out.println("Integer "+ in);
		
	}
}
