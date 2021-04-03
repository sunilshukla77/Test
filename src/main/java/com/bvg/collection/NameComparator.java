package com.bvg.collection;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.name.equals(o2.name)){
			if(o1.age>o2.age){
				return 1;
			}
			else if(o1.age <o2.age) {
				return -1;
			} else return 0;
		}
		return o1.name.compareTo(o2.name); 
	}
	
}
