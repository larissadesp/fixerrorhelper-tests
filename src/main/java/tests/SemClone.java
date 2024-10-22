package tests;

public class SemClone {
	public static void test() {
		try {
			SemClone obj = new SemClone();
			obj.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
