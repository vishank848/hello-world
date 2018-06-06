package com.model;

public class Student {

	private int id;

	private String firstName;

	private String lastName;

	private int age;
	
	private int marks;
	
	public Student(int id, String firstName, int age, int marks) {
		this.id = id;
		this.firstName = firstName;
		this.age = age;
		this.marks = marks;
	}

	public Student(int id, String firstName, String lastName, int age) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public Student(int id, String firstName, int age) {
		this.id = id;
		this.firstName = firstName;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("Student [id=%s, firstName=%s, lastName=%s, age=%s, marks=%s]", id, firstName, lastName, age, marks);
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}
