/**
 * 
 */
package com.elife.java8features;

/**
 * @author lputta
 *
 */
public class Employee {

	private String empName;
	private double salary;
	private int age;
	
	
	public Employee(String empName, double salary, int age) {
		super();
		this.empName = empName;
		this.salary = salary;
		this.age = age;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
