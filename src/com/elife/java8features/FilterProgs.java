package com.elife.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterProgs {

	public static void main(String[] args) {
		
		List<String> lines = Arrays.asList("spring", "node", "mkyong");

        List<String> result = lines.stream()                // convert list to stream
                .filter(line -> !"mkyong".equals(line))     // we dont like mkyong
                .collect(Collectors.toList());              // collect the output and convert streams to a List

        result.forEach(System.out::println);                //output : spring, node
        
        
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Lokesh", 50000, 34));
        empList.add(new Employee("Sravan", 60000, 26));
        empList.add(new Employee("Srisailam", 40000, 28));
        
        String name = empList.stream()
                .filter(emp -> 28 == emp.getAge())				// Checking the condition with filters
                .map(Employee::getEmpName)                        //convert stream to String
                .findAny()										
                .orElse("");
        
        System.out.println("result :" + name);
        
        
	}
}
