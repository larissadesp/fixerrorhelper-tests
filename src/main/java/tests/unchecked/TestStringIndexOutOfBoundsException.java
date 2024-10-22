package tests.unchecked;

public class TestStringIndexOutOfBoundsException {
	public static void test() {
		try {
			String str = "exemplo";
			char letra = str.charAt(10);
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}
