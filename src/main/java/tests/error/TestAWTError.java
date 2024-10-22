package tests.error;

import java.awt.AWTError;

public class TestAWTError {
	public static void test() {
		try {
			throw new AWTError("Graphics Environment is headless");
		} catch (AWTError e) {
			e.printStackTrace();
		}
	}
}
