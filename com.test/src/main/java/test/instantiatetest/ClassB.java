package test.instantiatetest;

public class ClassB extends ClassA {

	private String username;

	public ClassB() {
		// TODO Auto-generated constructor stub
	}

	public ClassB(String username) {
		this.setUsername(username);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
