package com.collections;

import java.util.Comparator;

public class Person implements Comparator<Person> {

	String ssn;
	String name;
	String age;
	String city;

	public Person() {
		
	}

	public Person(String ssn, String name, String age, String city) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [ssn=" + ssn + ", name=" + name + ", age=" + age + ", city=" + city + "]";
	}

	@Override
	public int compare(Person o1, Person o2) {

		if (o1.getName().equals(o2.getName())) {
			String thisSSN = o1.getSsn();
			String oSSn = o2.getSsn();
			return thisSSN.compareTo(oSSn);
		} else {
			return o1.getName().compareTo(o2.getName());
		}
	}

}
