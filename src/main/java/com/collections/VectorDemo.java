package com.collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		//Vector<String> names = new Vector<String>();
		List<String> names = new ArrayList<String>();
		names.add("Rohit");
		names.add("Abhay");
		names.add("Manisha");
		names.add("Kumar");
		names.add("Kumar");
		System.out.println(names.toString()); //prints all elements at a time
		
		//Retrieve elements using Enumeration
//		Enumeration<String> e = names.elements();
//		while(e.hasMoreElements()){
//			String name = e.nextElement();
//			System.out.print(name+" ");
//		}
		System.out.println();
		
		//Retrieve elements using Iterator
		Iterator<String> ittr = names.iterator();
		System.out.println("\n\n");
		System.out.println("Iterator");
		while(ittr.hasNext()){
			String name = ittr.next();
			System.out.print(name+" ");
			if(name.equals("Manisha")){
				ittr.remove();
			}
		}
		System.out.println("\n");
		for (String string : names) {
			System.out.print(string +" ");
		}
		System.out.println();

		//Retrieve elements using Iterator
		ListIterator<String> littr = names.listIterator();
		System.out.println("\n\n");
		System.out.println("ListIterator");
		while(littr.hasNext()){
			String name = littr.next();
			System.out.print(name+" ");
			if(name.equals("Manisha")){
			   littr.set("mAnIsHa");;
		   }
		}
		System.out.println();

		//Retrieve elements using Enhanced for loop
		for(String name : names){
			System.out.print(name+" ");
		}
		System.out.println();
		
		//Retrieve elements using Lambda expressions
		names.forEach(name->System.out.print(name+" "));
		
		System.out.println();
		
		//Retrieve elements using Method reference
		names.forEach(System.out::println);
	}
}
