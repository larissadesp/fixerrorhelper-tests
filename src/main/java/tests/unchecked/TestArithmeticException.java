package tests.unchecked;

public class TestArithmeticException {
	public static void test() {
		try {
			int x = 10 / 0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}
}
