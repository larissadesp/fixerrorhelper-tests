package tests.checked;

import java.lang.reflect.Method;

public class TestNoSuchMethodException {
	public void metodoExiste() { }

	public static void test() {
		try {
			Method metodo = TestNoSuchMethodException.class.getDeclaredMethod("metodoInexistente");
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}
}
