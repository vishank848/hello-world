package com.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {

	public static void main(String[] args) {
		List<StudentComparable> list = new ArrayList<StudentComparable>();
		list.add(new StudentComparable(1, "Mahesh", 12));
		list.add(new StudentComparable(2, "Suresh", 15));
		list.add(new StudentComparable(3, "Nilesh", 10));

		System.out.println("---Natural Sorting by Name---");
		List<StudentComparable> slist = list.stream().sorted().collect(Collectors.toList());
		slist.forEach(e -> System.out.println("Id:" + e.getId() + ", Name: " + e.getFirstName() + ", Age:" + e.getAge()));

		System.out.println("---Natural Sorting by Name in reverse order---");
		slist = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		slist.forEach(e -> System.out.println("Id:" + e.getId() + ", Name: " + e.getFirstName() + ", Age:" + e.getAge()));

		System.out.println("---Sorting using Comparator by Age---");
		slist = list.stream().sorted(Comparator.comparing(StudentComparable::getAge)).collect(Collectors.toList());
		slist.forEach(e -> System.out.println("Id:" + e.getId() + ", Name: " + e.getFirstName() + ", Age:" + e.getAge()));

		System.out.println("---Sorting using Comparator by Age with reverse order---");
		slist = list.stream().sorted(Comparator.comparing(StudentComparable::getAge).reversed()).collect(Collectors.toList());
		slist.forEach(e -> System.out.println("Id:" + e.getId() + ", Name: " + e.getFirstName() + ", Age:" + e.getAge()));
	}

}
