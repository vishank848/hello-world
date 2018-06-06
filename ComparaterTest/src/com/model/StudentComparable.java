package com.model;

public class StudentComparable implements Comparable<StudentComparable> {

	private int id;

	private String firstName;

	private String lastName;

	private int age;

	public StudentComparable(int id, String firstName, String lastName, int age) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public StudentComparable(int id, String firstName, int age) {
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
		return String.format("StudentComparable [id=%s, firstName=%s, lastName=%s, age=%s]", id, firstName, lastName, age);
	}

	@Override
	public int compareTo(StudentComparable ob) {
		return firstName.compareTo(ob.getFirstName());
	}

	@Override
	public boolean equals(final Object obj) {
		if (obj == null) {
			return false;
		}
		final StudentComparable std = (StudentComparable) obj;
		if (this == std) {
			return true;
		} else {
			return (this.firstName.equals(std.getFirstName()) && (this.age == std.getAge()));
		}
	}

	@Override
	public int hashCode() {
		int hashno = 7;
		hashno = 13 * hashno + (getFirstName() == null ? 0 : getFirstName().hashCode());
		return hashno;
	}
}
