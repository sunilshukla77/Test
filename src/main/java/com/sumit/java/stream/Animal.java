package com.sumit.java.stream;

public abstract class Animal{
	String[] type = {"Water Animal", "Air Animal", "Both Envornmrnt Animal"};
	
	Animal(){
	
	}
	Animal(String type){
		
	}
	Animal(int count, String type ){
		System.out.println(type+ " Animal "+ count);
	}
	
	public void eatable() {
		System.out.println("eatable");
	}
	
	public abstract void eatable(String name);
	
	public static void walkable(String name) {
		System.out.println(name+ " walkable");
	}
	
	}
