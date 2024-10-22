package tests.error;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;

public class TestFactoryConfigurationError {
	public static void test() {
		try {
			System.setProperty("javax.xml.parsers.DocumentBuilderFactory", "ClasseInexistente");
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			factory.newDocumentBuilder(); 
		} catch (FactoryConfigurationError e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}