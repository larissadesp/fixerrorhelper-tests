package tests.unchecked;

import tests.TesteEnum;

public class TestEnumConstantNotPresentException {
	public static void test() {
		try {
			TesteEnum valor = TesteEnum.valueOf(TesteEnum.class, "VALOR_INEXISTENTE");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
}
