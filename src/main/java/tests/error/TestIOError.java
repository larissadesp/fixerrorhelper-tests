package tests.error;

import java.io.FileInputStream;
import java.io.IOError;
import java.io.IOException;

public class TestIOError {
	public static void test() {
		try {
			FileInputStream file = new FileInputStream("caminho/inexistente/arquivo.txt");
		} catch (IOException e) {
			throw new IOError(e);
		} catch (IOError e) {
			e.printStackTrace(); 
		}
	}
}
