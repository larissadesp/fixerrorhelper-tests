package tests.unchecked;

public class TestArrayIndexOutOfBoundsException {
	public static void test() {
		try {
			int[] arr = new int[5];
			int x = arr[10];
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}
