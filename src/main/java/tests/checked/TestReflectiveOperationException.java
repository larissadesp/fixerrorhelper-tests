package tests.checked;

public class TestReflectiveOperationException {
	public static void test() {
		try {
			Class<?> clazz = Class.forName("ClasseInexistente");
		} catch (ReflectiveOperationException e) {
			e.printStackTrace();
		}
	}
}
