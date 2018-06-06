package test.nc;

public class Threads implements Runnable {

	static int i = 1;

	@Override
	public void run() {
		System.out.print("running" + i++);
	}
	
	public static void main(String[] args) {
		Thread t = new Thread(new Threads());
		t.run();
		t.run();
		t.start();
	}

}
