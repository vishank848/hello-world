package com.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Addmarks {

	public static void main(String[] args) {

		List<Student> stuList = new ArrayList<>();
		Student stuArr0 = new Student(10, "Mikey", 12, 10000);
		Student stuArr1 = new Student(20, "Arun", 5, 20000);
		Student stuArr2 = new Student(5, "Lisa", 16, 5000);
		Student stuArr3 = new Student(1, "Arun", 15, 50000);
		Student stuArr4 = new Student(1, "Ravi", 5, 8000);
		Student stuArr5 = new Student(1, "Lisa", 16, 6000);

		stuList.add(stuArr0);
		stuList.add(stuArr1);
		stuList.add(stuArr2);
		stuList.add(stuArr3);
		stuList.add(stuArr4);
		stuList.add(stuArr5);

		Map<String, Integer> marksMap = new HashMap<>();

		for (Student stu : stuList) {
			if (marksMap.containsKey(stu.getFirstName())) {
				int s = stu.getMarks() + marksMap.get(stu.getFirstName());
				marksMap.put(stu.getFirstName(), s);
			} else {
				marksMap.put(stu.getFirstName(), stu.getMarks());
			}
		}
		
		marksMap.forEach((k, v) -> System.out.println(k + " : " + v));

	}
}
