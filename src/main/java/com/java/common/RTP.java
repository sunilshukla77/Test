package com.java.common;

import java.util.Scanner;

class Payment {
	void pay(int amount) {
		System.out.println("Amount Paid \u20b9" + amount);
	}
}

class PayWithNetBanking extends Payment {

	void selectBank() {
		System.out.println("Banks Available");
		System.out.println("SBI");
		System.out.println("HDFC");
		System.out.println("UBI");
		System.out.println("ICICI");
	}

	void pay(int amount) {
		selectBank();
		System.out.println("Amount Paid through NetBanking \u20b9" + amount);
	}
}

class PayWithUPI extends Payment {

	void eneterUPI(String upi) {
		System.out.println("UPI " + upi + " shall be used");
	}

	void pay(int amount) {
		eneterUPI("ishant@abcbank");
		System.out.println("Amount Paid through UPI \u20b9" + amount);
	}
}

class PayWithCard extends Payment {

	void eneterCVV(String cardNumber, int cvv) {
		System.out.println("CardNumber " + cardNumber + " will be used for transaction");
		System.out.println("CVV " + cvv + " entered for transaction");
	}

	void pay(int amount) {
		eneterCVV("8888 6666 7777 1111", 123);
		System.out.println("Amount Paid through Card \u20b9" + amount);
	}
}

public class RTP {

	public static void main(String[] args) {

		System.out.println("How would You Pay ?");
		System.out.println("1. Net Banking");
		System.out.println("2. UPI");
		System.out.println("3. Card");
		System.out.println("4. Cash");

		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		scanner.close();

		Payment pRef; // pRef is reference variable of Parent class Payment :)

		if (choice == 1) {
			// Polymorphic Statement
			pRef = new PayWithNetBanking(); // Reference Variable of Parent can Refer to the Object of Child :)
		} else if (choice == 2) {
			pRef = new PayWithUPI();
		} else if (choice == 3) {
			pRef = new PayWithCard();
		} else if (choice == 4) {
			pRef = new Payment();
		} else {
			pRef = null;
			// nothing selected by user
		}

		if (pRef != null) {
			pRef.pay(5000);
		} else {
			System.out.println("Please Select a Valid Option to Pay :)");
		}
	}
}
