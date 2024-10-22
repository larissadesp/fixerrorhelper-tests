package tests.checked;

import java.lang.reflect.Field;

public class TestIllegalAccessException {
	private final String valor = "valor";

	public static void test() {
		try {
			TestIllegalAccessException obj = new TestIllegalAccessException();
			Field campo = TestIllegalAccessException.class.getDeclaredField("valor");
			campo.setAccessible(false);
			campo.set(obj, "novo valor");
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
	}
}
