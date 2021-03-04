package com;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

class Student {
	private int sno;
	private String sname;

	Student(int sno, String sname) {
		this.sno = sno;
		this.sname = sname;
	}

	public int getSno() {
		return sno;
	}

	public String getSname() {
		return sname;
	}

	@Override
	public String toString() {
		return sno + " " + sname;
	}
}

class SnoSort implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		Integer iRef1 = s1.getSno();
		Integer iRef2 = s2.getSno();
		return iRef1.compareTo(iRef2);
	}
}

public class DefaultMethodEx1 {
	public static void main(String[] args) {
		List<Student> students = new Vector<Student>();
		students.add(new Student(2, "abc"));
		students.add(new Student(1, "xyz"));
		students.add(new Student(3, "pqr"));
		System.out.println(students.toString());

		//Using sort() in Collections class before Java 8
		/*Collections.sort(students, new SnoSort()); 
		System.out.println(students.toString());*/
		
		//Using sort() in List interface in Java 8
		students.sort(new SnoSort());
		System.out.println(students.toString());
	}
}
