package com.collections;

public class TGenericDemo {

	// The Type <T> must be declared before return type.
	public <T> void setAnyValue(T t) {
		System.out.println(t.getClass().getSimpleName());
	}

	public <T extends Number> void setAnyNumbers(T t) {
		System.out.println(t.getClass().getSimpleName());
	}

	public static void main(String[] args) {
		TGenericDemo m = new TGenericDemo();
		m.setAnyValue(10);
		m.setAnyValue("10");
		
		m.setAnyNumbers(10);
		m.setAnyNumbers(10.0);
		//m.setNumbers("10"); //C.E. Type mismatch.
	}

}
