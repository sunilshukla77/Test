package com.aspire;

public class RunnableLambda {
	public static void main(String[] args) {
		// Anonymous Runnable
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("*** 7 *****");
			}
		};

		// Lambda Runnable
		Runnable r2 = () -> {System.out.println("##### 8 #####");}

		new Thread(r1).start();
		new Thread(r2).start();
	}
}
