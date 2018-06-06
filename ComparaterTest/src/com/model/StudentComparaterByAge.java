package com.model;

import java.util.Comparator;

public class StudentComparaterByAge implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getAge() - o2.getAge();
	}

}
