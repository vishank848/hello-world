package test.anothertest1;

public class M {

	static {
		System.out.println('A');
	}

	{
		System.out.println('B');
	}

	public M() {
		System.out.println('C');
	}

}
