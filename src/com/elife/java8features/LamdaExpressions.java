package com.elife.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamdaExpressions {

	public static void main(String[] args) {

		List<Employee> empList = getEmployeeList();
		// Normal Sorting 
		System.out.println("before Sort by using normal java");
		for (Employee employee : empList) {
			System.out.println(employee.getEmpName()  + " "+ employee.getAge() +" "+ employee.getSalary());
		}
		
		System.out.println("sort by age");
		
		Collections.sort(empList, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		
		System.out.println("after sort  by using normal java");
		for (Employee employee : empList) {
			System.out.println(employee.getEmpName()  + " "+ employee.getAge() +" "+ employee.getSalary());
		}
		
		// Java8 Sorting Method 1 
		empList.sort(new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getAge() - o2.getAge();
			}
		});

		System.out.println("after sort  by using Lamda java");
		for (Employee employee : empList) {
			System.out.println(employee.getEmpName()  + " "+ employee.getAge() +" "+ employee.getSalary());
		}
		
		
		// Java8 Lamda 
		// Java8 Lamda Sorting Method 2
		empList.sort((emp1 , emp2) -> emp1.getAge() - emp2.getAge());
		System.out.println("after sorting lamda :");
		empList.forEach((emp) -> System.out.println(emp.getEmpName()  + " "+ emp.getAge() +" "+ emp.getSalary()));
//		empList.forEach(System.out :: println);
		
		
	}
	
	private static List<Employee> getEmployeeList(){
		List<Employee> employee = new ArrayList<Employee>();

		employee.add(new Employee("mkyong", 70000, 33));
		employee.add(new Employee("alvin", 80000, 20));
		employee.add(new Employee("jason", 100000, 10));
		employee.add(new Employee("iris", 170000, 55));
		
		return employee;
	}

}
