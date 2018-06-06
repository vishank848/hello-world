package com.model;

import java.util.Comparator;

public class StudentComparaterByFirstName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getFirstName() == null && o2.getFirstName() == null) {
			return 0;
		} else if (o1.getFirstName() != null && o2.getFirstName() == null) {
			return -1;
		} else if (o1.getFirstName() == null && o2.getFirstName() != null) {
			return 1;
		} else {
			return o1.getFirstName().compareTo(o2.getFirstName());
		}

	}

}
