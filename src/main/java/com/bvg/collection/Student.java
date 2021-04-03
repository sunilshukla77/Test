package com.bvg.collection;

public class Student implements Comparable<Student> {
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		String nameR = o.name;
		// if(this.name< nameR) return 1 else if(this.name > nameR) return -1 else
		//return 0;
		return this.name.compareTo(nameR);
	}

}
