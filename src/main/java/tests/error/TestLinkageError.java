package tests.error;

class MyClassV1 {
	public void display() { }
}

class MyClassV2 {
	public void display() { }
}

public class TestLinkageError {
	public static void test() {
		try {
			loadClass("MyClassV1");
			loadClass("MyClassV2");
		} catch (LinkageError ex) {
			ex.printStackTrace();
		}
	}

	public static void loadClass(String className) throws LinkageError {
		if ("MyClassV1".equals(className)) {
			throw new LinkageError();
		}
	}
}