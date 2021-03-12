package com.bvg;

public class InterfaceDemoImpl implements InterfaceDemo, Comparable{
	
	public InterfaceDemoImpl(){
		
	}
	
	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}
	
	@Override
	public int sub(int a, int b) {
		return (a/2)-(b/2);
	}
	
	public float AreaCircle(int radius) {
		return (float) (2 * 3.14 * radius);
		
	}
	
	public static int AreaRectangle(int l, int b) {
		return l*b;
	}

	public static void main(String arg[]) {
		InterfaceDemo interDemo= new InterfaceDemo() {
			
			@Override
			public int mul(int a, int b) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		System.out.println(interDemo.add(5, 5));
		
		System.out.println(interDemo.sub(5, 5));
		
	}

	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
