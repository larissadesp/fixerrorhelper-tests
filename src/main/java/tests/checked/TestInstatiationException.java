package tests.checked;

import tests.ClasseAbstrata;

public class TestInstatiationException {
	public static void test() {
		try {
			ClasseAbstrata obj = ClasseAbstrata.class.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
