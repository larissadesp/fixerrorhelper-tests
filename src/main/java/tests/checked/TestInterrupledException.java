package tests.checked;

public class TestInterrupledException {
	public static void test() {
		Thread thread = new Thread(() -> {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		thread.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread.interrupt();
	}
}
