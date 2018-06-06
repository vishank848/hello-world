package test.inheritance;

public class ClassC implements ClassA, ClassB {

	public final static void main(String[] args) {
		ClassA a = new ClassC();
		a.fun();
		ClassB b = new ClassC();
		b.fun();
	}

	@Override
	public void fun() {
		System.out.println("from C");
	}
}
