package com.bvg;

class Bank {
	int getRateOfIntrest() {
		return 0;
	}
}

class SBI extends Bank {
	int getRateOfIntrest() {
		return 8;
	}
}

class ICICI extends Bank {
	int getRateofIntrest() {
		return 9;
	}
}

class AXIS extends Bank {
	int getRateOfIntrest() {
		return 10;
	}
}

public class BankingDemo1 {

	public static void main(String args[]) {
		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();
		System.out.println("SBI rate of intrest: " + s.getRateOfIntrest());
		System.out.println("ICICI rate of intrest: " + i.getRateofIntrest());
		System.out.println("AXIS rate of return: " + a.getRateOfIntrest());
	}
}
