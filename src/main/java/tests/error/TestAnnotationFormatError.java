package tests.error;

import java.lang.annotation.AnnotationFormatError;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface AnotacaoPraTeste {
	String valor();
}

public class TestAnnotationFormatError {
	public static void test() {
		try {
            AnotacaoPraTeste anotacao = TestAnnotationFormatError.class.getAnnotation(AnotacaoPraTeste.class);
            if (anotacao == null) {
                Method metodoInvalido = TestAnnotationFormatError.class.getDeclaredMethod("metodoInexistente");
            }
        } catch (NoSuchMethodException e) {
            throw new AnnotationFormatError(e);
        }
	}
}
