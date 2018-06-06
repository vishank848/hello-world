package com.model;

public class Employee implements Comparable<Employee> {

	private int id;

	private String firstName;

	private String lastName;

	public Employee(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
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

	@Override
	public String toString() {
		return String.format("Employee [id=%s, firstName=%s, lastName=%s]", id, firstName, lastName);
	}

	@Override
	public int compareTo(Employee o) {
		/*if (getId() < o.getId()) {
			return 0;
		} else {
			return 1;
		}*/
		
		return (this.id - o.id);
	}

}
