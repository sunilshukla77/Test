package com.bvg.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		List<String> al= new ArrayList();
		al.add("Sunil");
		al.add("Bvg");
		al.add("Arun");
		al.add("1231354");
		al.add("Ramesh");
		al.add("Varun");
		
		System.out.println("Ordered data");
		Iterator<String> it= al.iterator(); 
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\n\nGet Value index by ");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("\n\nSorted Value ");
		Collections.sort(al);
		for (String string : al) {
			System.out.println(string);
		}
		
		Collections.synchronizedList(al);
		for (String string : al) {
			System.out.println(string);
		}
		
	}

}
