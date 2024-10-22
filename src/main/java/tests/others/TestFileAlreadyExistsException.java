package tests.others;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestFileAlreadyExistsException {
	public static void test() throws IOException {
		try {
			Path path = Paths.get("arquivoExistente.txt");

			if (Files.exists(path)) {
				throw new FileAlreadyExistsException("O arquivo " + path + " já existe.");
			} else {
				Files.createFile(path);
			}
		} catch (FileAlreadyExistsException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
