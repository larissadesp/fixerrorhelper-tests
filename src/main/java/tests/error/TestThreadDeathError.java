package tests.error;

public class TestThreadDeathError {
	public static void test() {
		Thread thread = new Thread(() -> {
			try {
				for (int i = 0; i < 5; i++) {
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
//				e.printStackTrace();
			}
			throw new ThreadDeath();
		});
		thread.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		thread.interrupt();
	}
}
