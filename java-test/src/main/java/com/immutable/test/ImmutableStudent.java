package com.immutable.test;

public final class ImmutableStudent {
	private final int id;
	private final String name;
	private final Age age;

	public ImmutableStudent(int id, String name, Age age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Age getAge() {
		return age;
	}

	@Override
	public String toString() {
		return String.format("ImmutableStudent [id=%s, name=%s, age=%s]", id, name, age);
	}
	
}
