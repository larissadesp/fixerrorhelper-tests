package tests;

public class TesteSemClone {
	public static void test() {
		try {
			TesteSemClone obj = new TesteSemClone();
			obj.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
