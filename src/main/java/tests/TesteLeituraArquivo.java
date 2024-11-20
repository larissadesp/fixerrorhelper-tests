package tests;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TesteLeituraArquivo {
	public static void main(String[] args) {
		String caminhoDoArquivo = "caminho/para/o/arquivo.txt";
		try {
			lerArquivo(caminhoDoArquivo);
		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo: " + e.getMessage());
			e.printStackTrace();
		}
	}

	public static void lerArquivo(String caminho) throws IOException {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(caminho));
			String linha;
			while ((linha = reader.readLine()) != null) {
				System.out.println(linha);
			}
		} finally {
			if (reader != null) {
				reader.close();
			}
		}
	}
}
