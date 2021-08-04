package com.aspire;

import java.util.stream.Stream;

public class StreamFilter {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("Bhagyesh", "LION", "Seeker", "KEepr");
		stream.filter(str -> Character.isUpperCase(str.charAt(0))).forEach(System.out::println);
		
		
		 Employee11[] arrayOfEmps = {
				    new Employee11(1, "Jeff Bezos", 100000.0), 
				    new Employee11(2, "Bill Gates", 200000.0), 
				    new Employee11(3, "Mark Zuckerberg", 300000.0)
				};
		 
		//Add  an element
		Stream.Builder<Employee11> empStreamBuilder = Stream.builder();

		empStreamBuilder.accept(arrayOfEmps[0]);
		empStreamBuilder.accept(arrayOfEmps[1]);
		empStreamBuilder.accept(arrayOfEmps[2]);

		
		//Stream<Employee> empStream = empStreamBuilder.build().filter(e->(e.getId()>2)).collect(Collectors.counting()));
		
		//empStream.map(arrayOfEmps[][0]->arrayOfEmps[][1]).collect(Collections.toList());
		
		//List<Employee> employeeList = empStreamBuilder.build().collect(Collectors.toList());
		//System.out.println(employeeList.toString());
		
	}
}
