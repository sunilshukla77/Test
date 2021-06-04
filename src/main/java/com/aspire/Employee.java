/**
 * 
 */
package com.aspire;

/**
 * @author Sunil Shukla
 *
 */
public class Employee {
	
	int id;
	
	String name;
	
	int age;
	
	String gender;
	
	String department;
	
	int yearofJoin;
	
	double salary;

	public Employee(int id, String name, int age, String gender, String department, int yearofJoin, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearofJoin = yearofJoin;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getDepartment() {
		return department;
	}

	public int getYearofJoin() {
		return yearofJoin;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearofJoin=" + yearofJoin + ", salary=" + salary + "]";
	}
	
	

}
