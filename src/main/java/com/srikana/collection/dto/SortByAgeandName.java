package com.srikana.collection.dto;

import java.util.Comparator;


/**
 * @author Sunil Shukla
 * Use for multi-lavel sorting
 */
public class SortByAgeandName implements Comparator<Person>{

	public SortByAgeandName() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Person o1, Person o2) {
		int val= o1.name.compareTo(o2.name);
		if(val==0) {
			val = o1.age - o2.age;
		}
		return val;
	}

	


}
