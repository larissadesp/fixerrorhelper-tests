//package tests.unchecked;
//
//import java.lang.annotation.ElementType;
//import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;
//import java.lang.annotation.Target;
//
//@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType.TYPE)
//@interface MyAnnotation {
//	Class<?> value();
//}
//
//@MyAnnotation(value = MyNonExistentClass.class)
//class MyClass {
//}
//
//public class TestTypeNotPresentException {
//	public static void test() {
//		try {
//			Class<?> clazz = MyClass.class;
//			MyAnnotation annotation = clazz.getAnnotation(MyAnnotation.class);
//			Class<?> type = annotation.value();
//			Class.forName(type.getName());
//
//		} catch (ClassNotFoundException ex) {
//			ex.printStackTrace();
//		} catch (TypeNotPresentException ex) {
//			ex.printStackTrace();
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
//	}
//}
