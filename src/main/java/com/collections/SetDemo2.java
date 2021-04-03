package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Book implements Comparable<Book>{
	private int id;
	private String name;
	public Book(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public String toString(){
		return id+" "+name;
	}

	/*@Override
	public int hashCode() {
		System.out.println("*******");
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("#######");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}*/
	
	@Override
	public int compareTo(Book b){
		Integer iRef1 = this.id;
		Integer iRef2 = b.id;
		
		return iRef1.compareTo(iRef2);
	}
}

public class SetDemo2 {
	public static void main(String[] args) {
		Book b1 = new Book(2, "abc");
		Book b2 = new Book(1, "xyz");
		Book b3 = new Book(3, "pqr");
		Book b4 = new Book(3, "pqr"); //duplicate
		
		//Set<Book> books = new HashSet<Book>();
		//Set<Book> books = new LinkedHashSet<Book>();
		Set<Book> books = new TreeSet<Book>();
		
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		
		System.out.println(books.toString());
		
		Person p1= new Person("123", "Ravi", "20", "hyd");
		Person p2= new Person("124", "Sunil", "20", "hyd");
		Person p3= new Person("125", "Ram", "20", "hyd");
		Person p4= new Person("126", "Siva", "20", "hyd");
		Person p5= new Person("122", "Siva", "20", "hyd");
		
		String[] arryString = {"ab","as","rt","tp","qr"};
		
		List<Person> persons= new ArrayList();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		persons.add(p5);
		
		for (Person person : persons) {
			System.out.println(person.toString());
		}
		
		Collections.sort(Arrays.asList(arryString));
		for (int i = 0; i < arryString.length; i++) {
			System.out.println(i + " " + arryString[i]);
		}
		
		//Collections.sort(persons, new Comparator);
		for (Person person : persons) {
			System.out.println(person.toString());
		}
		
		
		
	}
}
