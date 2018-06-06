package test.nc;

public class aclass {
	public static void main(String[] args) {
		
		try {

			Hello2b hello1b = new Hello1b();
			hello1b.m1();
			System.out.print(",X:" + hello1b.x);

		} catch (Exception e) {
			System.out.print("Exception");
		}
	}
}

class Hello2b {
	int x = 10;

	void m1() {
		System.out.print("X:" + x);
	}
}

class Hello1b extends Hello2b {
	int x = 12;

	void m1() {
		System.out.print("X:" + x);
	}
}