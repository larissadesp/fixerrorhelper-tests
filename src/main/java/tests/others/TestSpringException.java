package tests.others;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class TestSpringException {
	public static void test() {
		try {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Recurso não encontrado");
		} catch (ResponseStatusException ex) {
			ex.printStackTrace();
		}
	}
}
