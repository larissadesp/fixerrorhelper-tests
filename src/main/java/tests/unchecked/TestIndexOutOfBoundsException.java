package tests.unchecked;

import java.util.ArrayList;
import java.util.List;

public class TestIndexOutOfBoundsException {
	public static void test() {
		try {
			List<String> lista = new ArrayList<>();
			lista.add("item1");
			String valor = lista.get(1);
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}
