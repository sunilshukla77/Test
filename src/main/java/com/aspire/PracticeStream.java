package com.aspire;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class PracticeStream {

	static List<Employee> employeeList = new ArrayList<>();
	
	public static void main(String[] args) {

		employeeList.add(new Employee(111, "Arjun", 40, "Male", "Bank", 2001, 50000));
		employeeList.add(new Employee(112, "Priya", 35, "Female", "IT", 2010, 5000));
		employeeList.add(new Employee(123, "Sunil", 40, "Male", "IT", 2011, 10000));
		employeeList.add(new Employee(124, "Seema", 55, "Female", "Bank", 2012, 40000));
		employeeList.add(new Employee(125, "Kapil", 40, "Male", "Bank", 2014, 80000));
		employeeList.add(new Employee(126, "Prity", 36, "Female", "Bank", 2012, 90000));
		employeeList.add(new Employee(128, "Bhagyesh", 25, "Male", "IT", 2001, 100000));
		employeeList.add(new Employee(129, "Sumit", 42, "Male", "Bank", 2001, 120000));
		employeeList.add(new Employee(112, "Ruchi", 31, "Female", "IT", 2016, 70000));
		employeeList.add(new Employee(114, "Anu", 47, "Female", "Bank", 2017, 30000));
		employeeList.add(new Employee(116, "Tina", 42, "Female", "IT", 2010, 10000));
		
		// How many male and Female?
		System.out.println("How many male and Female? ");
		Map<String, Long> noOfMF=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(noOfMF);
		
		//Name of all the department?
		System.out.println("Name of all the department? ");
		employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		
		// Avarage age of male and female?
		System.out.println("Avarage age of male and female? ");
		Map<String, Double> avarageAgeofMaleF=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println(avarageAgeofMaleF);
				
		//Get detail of highest paid in employee?
		System.out.println("Get detail of highest paid in employee? ");
		Optional<Employee> highestSal = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		System.out.println(highestSal.get().getName() +" salery " +highestSal.get().getSalary() );
		//Get name of all the employee who join after 2010?
		
		//Count the employee in each department?
		
		//what is the avarage salary of employee in each department?
		
	}

}
