package test.classtest;

public class ClassC extends ClassB {
	
	{
        System.out.println(3);
    }

	public static void main(String[] args) {
		
		ClassC c = new ClassC();
		
		ClassA a = new ClassB();
		a.fun();
		System.out.println(a.i);
		
		ClassA a0 = new ClassA();
		a0.fun();
		System.out.println(a0.i);
		
		ClassB b = new ClassB();
		b.fun();
		System.out.println(b.i);
	}

}
