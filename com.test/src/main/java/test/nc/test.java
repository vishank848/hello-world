package test.nc;

public class test {
	public static void main(String[] args) {
		try {
			//Hello1 hello1 = new Hello2();
			Hello1 hello1 = new Hello1();
			System.out.print("X:" + hello1.x);
			//Hello2 hello1 = new Hello1();
			Hello2 hello2 = new Hello1();
			//System.out.print(",X:" + hello1.x);
			System.out.print(",X:" + hello2.x);
		} catch (Exception e) {
			System.out.print("Exception");
		}
	}
}

class Hello2 {
	int x = 10;
}

class Hello1 extends Hello2 {
	int x = 12;
}