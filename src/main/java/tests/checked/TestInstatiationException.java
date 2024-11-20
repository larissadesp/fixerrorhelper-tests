package tests.checked;

import tests.TesteClasseAbstrata;

public class TestInstatiationException {
	public static void test() {
		try {
			TesteClasseAbstrata obj = TesteClasseAbstrata.class.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
