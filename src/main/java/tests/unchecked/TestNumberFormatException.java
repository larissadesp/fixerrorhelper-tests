package tests.unchecked;

public class TestNumberFormatException {
	public static void test() {
		try {
			int num = Integer.parseInt("abc");
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
