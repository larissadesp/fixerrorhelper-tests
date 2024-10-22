package tests.unchecked;

public class TestIllegalArgumentException {
	public static void test() {
		try {
			Thread.sleep(-1000);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
