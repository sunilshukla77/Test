package com.thread;

public class MyThread1 implements Runnable {
	Thread t;
	String s = null;
	MyThread1(String s1){
		s=s1;
		t=new Thread(this);
		t.start();
	}
	public class RunableThread{
	public void main(String[] args) {
		new MyThread1("Thread strted....");
	}
		
	}
	@Override
	public void run() {
		System.out.println(s);
		
	}

}
