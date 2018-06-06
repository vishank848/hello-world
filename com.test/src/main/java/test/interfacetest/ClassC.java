package test.interfacetest;

public class ClassC implements InterfaceB {

	@Override
	public void fun() {
		System.out.println("from ClassC fun");
	}
	
	public static void main(String[] args) {
		ClassC c = new ClassC();
		c.fun();
		
		InterfaceA a = new ClassC();
		a.fun();
		
		InterfaceB b = new ClassC();
		b.fun();
	}

}
