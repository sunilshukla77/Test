package com.srikana.collection;

public class TestExample {

	public TestExample() {
	}

	public static void main(String[] args) {
		ArithmaticImpl at= new ArithmaticImpl();
		System.out.println(at.add(5, 10));
		
		System.out.println(at.sustract(5, 10));
		
		IMathOperation arth = new ArithmaticImpl();
		
		System.out.println(arth.add(15, 18));
		
		System.out.println(arth.sustract(12, 6));
		
		int[] arrayint= {2,3,54,6,7};
		String[] strArray= new String[6];
		strArray[2]="Srikana";
		strArray[0]="Ram";
		strArray[5]="Sunil";
		
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
	}

}
