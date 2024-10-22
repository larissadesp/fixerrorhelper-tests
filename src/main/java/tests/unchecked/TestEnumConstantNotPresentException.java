package tests.unchecked;

import tests.EnumTestEnum;

public class TestEnumConstantNotPresentException {
	public static void test() {
		try {
			EnumTestEnum valor = EnumTestEnum.valueOf(EnumTestEnum.class, "VALOR_INEXISTENTE");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
}
