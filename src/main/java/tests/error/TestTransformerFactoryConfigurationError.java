package tests.error;

import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;

public class TestTransformerFactoryConfigurationError {
	public static void test() {
		try {
            System.setProperty("javax.xml.transform.TransformerFactory", "com.exemplo.ClasseInexistente2");
            TransformerFactory factory = TransformerFactory.newInstance();
        } catch (TransformerFactoryConfigurationError e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
