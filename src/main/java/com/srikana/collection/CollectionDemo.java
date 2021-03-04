package com.srikana.collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.srikana.collection.dto.Person;
import com.srikana.collection.dto.SortByAgeandName;

/**
 * @author Sunil Shukla
 *
 */
public class CollectionDemo {

	/**
	 * 
	 */
	public CollectionDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args []) {
		Person p1= new Person("Srikana",20,"sri","RTP");
		Person p2= new Person("Amit",40,"amt","WS");
		Person p3= new Person("Puneet",20,"pun","NYC");
		Person p4= new Person("Sunil",30,"","CA");
		Person p5= new Person("Amit",20,"amty","CA");
		Person p6= new Person("Ram",60,"","WS");
		
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add(p4);
		personList.add(p5);
		personList.add(p6);
		
		Collections.sort(personList);
		for (Person person : personList) {
			System.out.println(person.toString());
		}
		
		Collections.sort(personList, new SortByAgeandName());
		System.out.println("\n\n\n");
		for (Person person : personList) {
			System.out.println(person.toString());
		}
		
	}
}
