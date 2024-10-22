package tests.unchecked;

public class TestIllegalMonitorStateException {
	public static void test() {
		try {
			Object objeto = new Object();
			objeto.wait();
		} catch (IllegalMonitorStateException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
