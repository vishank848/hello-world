package test.nc;

public class NCT8 {

	public static void main(String[] args) {
		try {
			int x = 0;
			int y = 10 / x;
			System.out.print("1");
		} catch (ArithmeticException re) {
			System.out.print("2");
		} catch (RuntimeException ae) {
			System.out.print("3");
		} catch (Exception e) {
			System.out.print("4");
		} finally {
			System.out.print("5");
		}
	}
}
