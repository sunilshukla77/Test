package com.thread;

public class Multi implements Runnable {
	
	

	public static void main(String[] args) {
		Multi m1 = new Multi();
		Thread t1 = Thread(m1);
		t1.start();
	}

	private static Thread Thread(Multi m1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running");
		
	}

}
