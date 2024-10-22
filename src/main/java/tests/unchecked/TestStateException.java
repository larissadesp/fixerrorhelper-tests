package tests.unchecked;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestStateException {
	public static void test() {
		try {
			List<String> lista = new ArrayList<>();
			Iterator<String> iterator = lista.iterator();
			iterator.remove();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
	}
}
