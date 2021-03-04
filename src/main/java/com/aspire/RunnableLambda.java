package com.aspire;

public class RunnableLambda {
	public static void main(String[] args) {
		// Anonymous Runnable
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("*****");
			}
		};

		// Lambda Runnable
		Runnable r2 = () -> System.out.println("#########");

		new Thread(r1).start();
		new Thread(r2).start();
	}
}
