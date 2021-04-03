package com.bvg.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> al= new ArrayList<Student>();
		al.add(new Student (101,"Jay",27));
		al.add(new Student (102,"Ajay",32));
		al.add(new Student (103,"Vijay",29));
		al.add(new Student (104,"Vijay",30));
		al.add(new Student (105,"Vijay",60));
		al.add(new Student (106,"Vijay",40));
		
		System.out.printf("%n");
		System.out.println("Sorting by Name");
		
		Collections.sort(al);
		Iterator<Student> itr = al.iterator();
		while (itr.hasNext()) {
			Student st = (Student)itr.next();
			System.out.println(st.rollno+ "  " +st.name+ "  " +st.age);
		}
		
		Collections.sort(al, new NameComparator());
		Iterator<Student> itr11 = al.iterator();
		System.out.printf("%n %n");
		System.out.println("Name and Age");
		while (itr11.hasNext()) {
			Student st = (Student)itr11.next();
			System.out.println(st.rollno+ "  " +st.name+ "  " +st.age);
		}
		
		System.out.printf("%n %n"
				+ "");
		System.out.println("Sorting by age");
		
		Collections.sort(al, new AgeComaparator());
		Iterator<Student> itr2 = al.iterator();
		while(itr2.hasNext()) {
			Student st = (Student)itr2.next();
			System.out.println(st.rollno+"  "+st.name+"  "+st.age);
			}
	}

}
