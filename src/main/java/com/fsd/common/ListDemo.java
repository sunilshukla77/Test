package com.fsd.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.collections.Person;

public class ListDemo {

	public ListDemo() {
	}
	
	public static void main(String[] args) {

		//Array
		String[] arryString = new String[4];
		arryString[0]= "Anand";
		arryString[1]= "Sunil";
		arryString[2]= "Prashant";
		arryString[3]= "Sumit";
		
		//List Default size 8 dynamically increase size
		List al= new ArrayList();
		al.add("Sunil");
		al.add(1234);
		al.add(12345.12);
		al.add(new Person("12", "Anand", "25", "Pune"));
		
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
			
		}
		
		for (Object object : al) {
			System.out.println(object);
		}
		
		List ald= Arrays.asList(arryString);
		ald.addAll(al);
		
		for (int i = 0; i < ald.size(); i++) {
			System.out.println(ald.get(i));
		}
		
		List<Person> listPerson = new ArrayList();
		listPerson.add(new Person("12", "Anand", "25", "Pune"));
		listPerson.add(new Person("12", "Prashant", "25", "Pune"));
		listPerson.add(new Person("12", "Sunil", "25", "Pune"));
		listPerson.add(new Person("12", "Test", "25", "Pune"));
		listPerson.add(new Person("12", "Anand", "25", "Pune"));
		
		
	}

}
