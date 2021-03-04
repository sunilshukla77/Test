package com.collections;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {
	public static void main(String[] args) {
		//Set<String> names = new HashSet<String>();
		//Set<String> names = new LinkedHashSet<String>();  //Insersion order
		Set<String> names = new TreeSet<String>();  //Alphabetical Sequence
		
		names.add("AA");
		names.add("AB");
		names.add("SI");
		names.add("RO");
		names.add("RO");
		names.add(null); //Not Allow null
		System.out.println(names.toString());
	}
}
