package com.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class ReadWriteExample {

	public static void main(String[] args) throws InterruptedException {
		Customer c1 = new Customer();
		c1.setName("Sunil");
		//System.out.println(c1.toString());

		Customer c2 = new Customer();
		c2.setName("Shokrullaa");
		//System.out.println(c2.toString());

		Customer c3 = new Customer();
		c3.setName("Sumit");
		//System.out.println(c3.toString());
		
		Thread t1 = new Thread(c1);
		t1.start();

		Thread t2 = new Thread(c2);
		t2.start();
		
		Thread t3 = new Thread(c3);
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
	}

}

class Customer implements Runnable {
	static AtomicInteger counter = new AtomicInteger(); // 

	int id;
	String name;

	public Customer() {
		id = counter.getAndIncrement();
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}

	@Override
	public void run() {
		System.out.println("Customer [id=" + id + ", name=" + name + "]");
		
		
	}

}
