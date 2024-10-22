package tests.error;

public class TestAssertionError {
	public static void test() {
		int x = 1;
		if (x != 2) {
			throw new AssertionError(x);
		}
	}
}
