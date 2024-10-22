package tests.error;

import java.nio.charset.CoderMalfunctionError;

public class TestCoderMalfunctionError {
	public static void test() {
		try {
			throw new CoderMalfunctionError(new Exception("Falha no codificador."));
		} catch (CoderMalfunctionError e) {
			e.printStackTrace(); 
		}
	}
}
