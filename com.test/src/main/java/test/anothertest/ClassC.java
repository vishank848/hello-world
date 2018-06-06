package test.anothertest;

public class ClassC extends ClassB {
	String s = "Class C";

	{
		System.out.println(super.s);
	}
}
