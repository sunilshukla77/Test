package com.aspire;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx3 {

	public static void main(String[] args) {
	
		List<Employee11> le= new ArrayList<Employee11>();
		le.add(new Employee11(1,"Sum", 1000d));
		le.add(new Employee11(2,"Sun", 2000d));
		le.add(new Employee11(3,"Arr", 3000d));
		le.add(new Employee11(4,"Sud", 16000d));
		le.add(new Employee11(5,"Sup", 8000d));
		le.add(new Employee11(6,"Bat", 5000d));
		
		le.stream().filter(e-> e.getSalary()>5000d).collect(Collectors.toList()).forEach(System.out::println);
		
		//le.stream().map(e->e.getSalary()).distinct().collect(Collectors.toList()).forEach(System.out::println);
		
		//le.stream().map(e-> e.getId()).sorted().collect(Collectors.toList()).forEach(System.out::println);
				
		//le.stream().map(e->e.getName()).sorted(Collections.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);

		//le.stream().map(e->e.getSalary()).sorted().collect(Collectors.toList()).forEach(System.out::println);
				
		//le.stream().peek(e->e.getId()).collect(Collectors.toList()).forEach(System.out::println);
				
		//* le.stream().map(e->e.getSalary()).max(Comparator.reverseOrder()).get().collect(Collectors.toList()).forEach(System.out::println);
				
		//le.stream().flatMap(e->e.getName()).collect(Collectors.toList()).forEach(System.out::println);
	}

}
