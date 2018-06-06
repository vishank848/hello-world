package test.anothertest1;

public class N extends M {
	static {
		System.out.println('D');
	}

	{
		System.out.println('E');
	}

	public N() {
		System.out.println('F');
	}
}
