package com.aspire;

import java.util.stream.Stream;

public class StreamEx3 {
	private static Employee[] arrayOfEmps = {
			new Employee(1,"Jeff Bezos", 100000.0),
			new Employee(2,"Bill Gates", 200000.0),
			new Employee(3,"Mark", 300000.0)
					};
	Stream<Employee> employees = Stream.of(arrayOfEmps);
	public static Employee[] getArrayOfEmps() {
		return arrayOfEmps;
	}

	public static void setArrayOfEmps(Employee[] arrayOfEmps) {
		StreamEx3.arrayOfEmps = arrayOfEmps;
	}
	}
class Employee{
	private Integer id;
	private String name;
	private Double salary;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}
	public Employee (Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		
		}
	}

		

