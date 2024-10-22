package tests.unchecked;

public class TestThreadStateException {
	public static void test() {
		try {
			Thread thread = new Thread();
			thread.start();
			thread.start();
		} catch (IllegalThreadStateException e) {
			e.printStackTrace();
		}
	}
}
