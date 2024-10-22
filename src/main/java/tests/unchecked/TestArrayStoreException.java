package tests.unchecked;

public class TestArrayStoreException {
	public static void test() {
		try {
			Object[] array = new String[5];
			array[0] = new Object();
		} catch (ArrayStoreException e) {
			e.printStackTrace();
		}
	}
}
