package tests.unchecked;

import java.util.Collections;
import java.util.List;

public class TestUnsupportedOperationException {
	public static void test() {
		try {
			List<String> lista = Collections.emptyList();
			lista.add("item");
		} catch (UnsupportedOperationException e) {
			e.printStackTrace();
		}
	}
}
