package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
	public static void main(String arg[]) {
		/*
		 * int[] a = { 24, 12, 434, 1234, 123 };// Primitive int, long, byte, boolean,
		 * double, char // wrapper or Reference types class : Interger class, Long,
		 * Byte, Boolean, // Double, Char String[] str = { "Iniyann", "Sunil",
		 * "Nagarjun" }; String[] strSize = new String[5];
		 * 
		 * for (int i = 0; i < a.length; i++) { System.out.println("int array  " +
		 * a[i]); }
		 * 
		 * for (int i = 0; i < strSize.length; i++) { strSize[i] = "TestValue" + i;
		 * System.out.println("String Value  " + strSize[i]); }
		 * 
		 * for (int i = 0; i < str.length; i++) { System.out.println(str[i]); }
		 */

		List<Employer> employerLinkedList = new LinkedList();
		Employer e1 = new Employer("Dell", "1234", 12345L);
		Employer e2 = new Employer("Google", "1244", 12345L);
		Employer e3 = new Employer("Apple", "1534", 12345L);
		Employer e4 = new Employer("HP", "1334", 12345L);
		Employer e5 = new Employer("Dell", "1234", 12345L);
		Employer e6 = new Employer("Tata", "1244", 12345L);

		employerLinkedList.add(e1);
		employerLinkedList.add(e2);
		employerLinkedList.add(e3);
		employerLinkedList.add(e4);
		employerLinkedList.add(e5);
		employerLinkedList.add(e6);

		for (Iterator iterator = employerLinkedList.iterator(); iterator.hasNext();) {
			Employer employer = (Employer) iterator.next();
			System.out.println("LinkedList " + employer.toString());

		}
		System.out.println("\n\n\n");

		List<Employer> employerList = new ArrayList<Employer>();
		employerList.addAll(employerLinkedList);

		for (Employer employer : employerList) {
			System.out.println("ArrayList \t" + employer.toString());

		}
		System.out.println("\n\n\n");

		Set<Employer> employerSet = new HashSet();
		employerSet.addAll(employerList);

		for (Employer employer : employerSet) {
			System.out.println("HashSet \t" + employer.toString());
		}

		System.out.println("\n\n\n");
		Set<String> employerTreeSet = new TreeSet<>();
		employerTreeSet.add("Sunil");
		employerTreeSet.add("Iniyan");
		employerTreeSet.add("Anil");
		employerTreeSet.add("Ram");
		employerTreeSet.add("Varun");
		

		for (String employer : employerTreeSet) {
			System.out.println("TreeSet \t" + employer.toString());
		}

		System.out.println("\n\n\n");
		Set<Employer> employerLinkedSet = new LinkedHashSet<Employer>();
		employerLinkedSet.addAll(employerList);

		for (Employer employer : employerLinkedSet) {
			System.out.println("LinkedHashSet \t" + employer.toString());
		}

	}

}

class Employer {

	public Employer(String nameCompany, String registrationNo, long mobileNo) {
		super();
		this.nameCompany = nameCompany;
		this.registrationNo = registrationNo;
		this.mobileNo = mobileNo;
	}

	String nameCompany;
	String registrationNo;
	long mobileNo;

	public String getNameCompany() {
		return nameCompany;
	}

	public void setNameCompany(String nameCompany) {
		this.nameCompany = nameCompany;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Employer [nameCompany=" + nameCompany + ", registrationNo=" + registrationNo + ", mobileNo=" + mobileNo
				+ "]";
	}

}