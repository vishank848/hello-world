package test.classtest;

public class ClassB extends ClassA {
	
	int i = 20;
	
	{
        System.out.println(2);
    }

	public void fun() {
		System.out.println("from classB fun");
	}

	public static void main(String[] args) {
		ClassA a = new ClassB();
		a.fun();

		ClassA a0 = new ClassA();
		a0.fun();

		ClassB b = new ClassB();
		b.fun();
	}

}
