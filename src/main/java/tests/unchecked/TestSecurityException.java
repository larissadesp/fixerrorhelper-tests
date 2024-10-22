package tests.unchecked;

public class TestSecurityException {
	public static void test() {
		try {
			System.getSecurityManager().checkPermission(new RuntimePermission("exemplo"));
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
}
