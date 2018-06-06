package test.nc;

public class TestAbs extends B {

	public TestAbs() {
		this.printA();
		this.printB();
	}

	public static void main(String[] args) {
		new TestAbs().printA();
	}
}

abstract class B extends A {
	public void printA() {
		System.out.println("class B");
	}
}

abstract class A {
	public void printB() {
		System.out.println("class A");
	}
}