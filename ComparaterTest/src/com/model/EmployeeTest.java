package com.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {

		List<Employee> employeesList = new ArrayList<>();

		Employee emp1 = new Employee(43, "Ramesh", "Sharma");
		Employee emp2 = new Employee(23, "Ramesh", "Sharma");
		Employee emp3 = new Employee(31, "Rakesh", "Sharma");

		employeesList.add(emp1);
		employeesList.add(emp2);
		employeesList.add(emp3);
		
		Collections.sort(employeesList);
		
		employeesList.forEach(System.out::println);
		
		//sorting object array
		Employee[] empArr = new Employee[4];
		empArr[0] = new Employee(10, "Mikey", "Sharma");
		empArr[1] = new Employee(20, "Arun", "Pathak");
		empArr[2] = new Employee(5, "Lisa", "Kumar");
		empArr[3] = new Employee(1, "Pankaj", "Singh");
		
		Arrays.sort(empArr);
		System.out.println("Default Sorting of Employees list:\n"+Arrays.toString(empArr));


	}
}
