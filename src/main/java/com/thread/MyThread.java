package com.thread;

public class MyThread {
	String s= null;
	MyThread(String s1){
		s=s1;
		start();
	}	
	private void start() {
		System.out.println(s);
	}
	public static void main(String[] args) {
		new MyThread("Thread started....");
	}
}
	

