package com.srikana.collection;

public class ArithmaticImpl implements IMathOperation{

	public ArithmaticImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int sustract(int a, int b) {
		return a-b;
	}

}
