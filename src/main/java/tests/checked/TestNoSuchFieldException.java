package tests.checked;

import java.lang.reflect.Field;

public class TestNoSuchFieldException {
	private String campoExiste;

	public static void test() {
		try {
			Field campo = TestNoSuchFieldException.class.getDeclaredField("campoInexistente");
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
	}
}
