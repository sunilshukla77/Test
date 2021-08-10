package com.java.rahul;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//Create 
public class CollectionDemo {

	public static void main(String[] args) {
		String[] strArray =  {"Rahul", "Sunil", "Sri Ram","Arun","Priya"}; 
		System.out.println("Size: "+ strArray.length);
		
		List <String> al = new ArrayList<>(); // Default Size of arraylist 16
		System.out.println("***** List ******");
		al.add("Rahul");
		al.add("Arun");
		al.add("Nikhil");
		al.add("Priya");
		al.add("Sri Ram");
		al.add("Rahul");
		al.add("Arun");
		al.add("Nikhil");
		al.add("Priya");
		al.add("Sri Ram");
		//Collections.sort(al);// Util class
		Collections.synchronizedList(al);
		for (String string : al) {
			System.out.println(string+ " index " + al.indexOf(string));
		}
		System.out.println("Size: "+ al.size());
		
		Set<String> hashset = new LinkedHashSet();
		System.out.println("***** HashSet ******");
		hashset.add("Rahul");
		hashset.add("Arun");
		hashset.add("Nikhil");
		hashset.add("Priya");
		hashset.add("Sri Ram");
		hashset.add("Rahul");
		hashset.add("Arun");
		hashset.add("Nikhil");
		hashset.add("Priya");
		hashset.add("Sri Ram");
		Collections.synchronizedSet(hashset);// Util class
		for (String string : hashset) {
			System.out.println(string);
		}
		System.out.println("Size: "+ hashset.size());
		
		System.out.println("***** HashMap ******");
		Map<String, String> map = new LinkedHashMap<String, String>();
		map.put("Science", "Rahul");
		map.put("Arts", "Arun");
		map.put("Computer", "Sri ram");
		map.put("Electric", "Priya");
		map.put("Arts", "Saman");
		Collections.synchronizedMap(map);
		Iterator<String> it = map.keySet().iterator();
				
		for (Iterator iterator = map.keySet().iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
			
		}

	}

}
