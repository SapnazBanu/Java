package com.xworkz.encapsulation.runner;

import com.xworkz.encapsulation.Employee;

public class EmployeeRunner {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setName("Aswin");
		System.out.println(emp.getName());
		emp.setAge(20);
		System.out.println(emp.getAge());
		emp.setSalary(40000);
		System.out.println(emp.getSalary());
		
	}

}