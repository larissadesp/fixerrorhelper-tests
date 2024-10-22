package tests.unchecked;

public class TestClassCastException {
	public static void test() {
		try {
			Object x = new Integer(0);
			System.out.println((String) x);
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
	}
}
