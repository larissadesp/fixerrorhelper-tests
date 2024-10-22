package tests.checked;

public class TestClassNotFoundException {
	public static void test() {
		try {
			Class.forName("ClasseInexistente");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
