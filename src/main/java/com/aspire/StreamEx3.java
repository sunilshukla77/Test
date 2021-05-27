package com.aspire;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx3 {

	public static void main(String[] args) {
	
		List<Employee> le= new ArrayList();
		le.add(new Employee(1,"Sum", 1000d));
		le.add(new Employee(2,"Sun", 2000d));
		le.add(new Employee(3,"Arr", 3000d));
		le.add(new Employee(4,"Sud", 16000d));
		le.add(new Employee(5,"Sup", 8000d));
		le.add(new Employee(6,"Bat", 5000d));
		
		le.stream().filter(e-> e.getSalary()>5000d).collect(Collectors.toList()).forEach(System.out::println);
		
	}

}

class Employee {
	
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;

	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	
}
