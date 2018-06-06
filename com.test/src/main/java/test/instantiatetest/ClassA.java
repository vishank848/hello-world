package test.instantiatetest;

public class ClassA {

	private String name;

	public ClassA() {

	}

	public ClassA(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
