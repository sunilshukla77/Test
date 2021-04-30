package com.srikana.collection;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.collections.Person;

@Component
public class Employer extends Person {
	
	String name;
	String ssn;
	String address;
	

	public Employer() {
		// TODO Auto-generated constructor stub
	}


	public Employer(String name, String ssn, String address) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.address = address;
	}


	public String getName() {
		return name;
	}


	@Bean("setNam")
	public void setName(String name) {
		this.name = name;
	}


	public String getSsn() {
		return ssn;
	}


	public void setSsn(String ssn) {
		this.ssn = ssn;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Employer [name=" + name + ", ssn=" + ssn + ", address=" + address + "]";
	}
	

	
}
