package tests.unchecked;

public class TestNegativeArraySizeException {
	public static void test() {
		try {
			int[] array = new int[-1];
		} catch (NegativeArraySizeException e) {
			e.printStackTrace();
		}
	}
}
