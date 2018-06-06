package com.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		
		//sorting object array
		List<Student> stuList = new ArrayList<>();
		Student stuArr0 = new Student(10, "Mikey", "hhh", 10000);
		Student stuArr3 = new Student(1, null, "etg", 50000);
		Student stuArr1 = new Student(20, "Arun", "dsd", 20000);
		Student stuArr2 = new Student(5, "Lisa", "swe", 5000);
		
		stuList.add(stuArr0);
		stuList.add(stuArr3);
		stuList.add(stuArr1);
		stuList.add(stuArr2);
		
		//Collections.sort(stuList, new StudentComparaterByAge());
		
		//System.out.println("Default Sorting of Student list by age:\n"+stuList);
		
		//stuList.sort((p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));
		
		//stuList.sort(Comparator.comparing(Student::getFirstName, Comparator.nullsLast(Comparator.naturalOrder())));

		//stuList.forEach(System.out::println);
		
		Collections.sort(stuList, new StudentComparaterByFirstName());
		
		System.out.println("Default Sorting of Student list by firstname:\n"+stuList);
		
		String s1 = "asas";
		
		String s2 = null;
		System.out.println(s1.equals(s2));
		//System.out.println(s2.equals(s1));
		System.out.println(null instanceof Object);
		
		//System.out.println(fun());

	}
	
	private static void fun() {
		
	}

}
