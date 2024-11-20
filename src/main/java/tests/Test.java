package tests;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

import tests.checked.TestClassNotFoundException;
import tests.checked.TestCloneNotSupportedException;
import tests.checked.TestIllegalAccessException;
import tests.checked.TestInstatiationException;
import tests.checked.TestInterrupledException;
import tests.checked.TestNoSuchFieldException;
import tests.checked.TestNoSuchMethodException;
import tests.checked.TestReflectiveOperationException;
import tests.error.TestAWTError;
import tests.error.TestAnnotationFormatError;
import tests.error.TestAssertionError;
import tests.error.TestCoderMalfunctionError;
import tests.error.TestFactoryConfigurationError;
import tests.error.TestIOError;
import tests.error.TestLinkageError;
import tests.error.TestServiceConfigurationError;
import tests.error.TestThreadDeathError;
import tests.error.TestTransformerFactoryConfigurationError;
import tests.error.TestVirtualMachineError;
import tests.others.TestFileAlreadyExistsException;
import tests.others.TestSQLException;
import tests.others.TestSpringException;
import tests.unchecked.TestArithmeticException;
import tests.unchecked.TestArrayIndexOutOfBoundsException;
import tests.unchecked.TestArrayStoreException;
import tests.unchecked.TestClassCastException;
import tests.unchecked.TestEnumConstantNotPresentException;
import tests.unchecked.TestIllegalArgumentException;
import tests.unchecked.TestIllegalMonitorStateException;
import tests.unchecked.TestIndexOutOfBoundsException;
import tests.unchecked.TestNegativeArraySizeException;
import tests.unchecked.TestNullPointerException;
import tests.unchecked.TestNumberFormatException;
import tests.unchecked.TestSecurityException;
import tests.unchecked.TestStateException;
import tests.unchecked.TestStringIndexOutOfBoundsException;
import tests.unchecked.TestThreadStateException;
//import tests.unchecked.TestTypeNotPresentException;
import tests.unchecked.TestUnsupportedOperationException;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(" --- ERROR --- ");
		System.out.println("1. TestAnnotationFormatError");
		System.out.println("2. TestAssertionError");
		System.out.println("3. TestAWTError");
		System.out.println("4. TestCoderMalfunctionError");
		System.out.println("5. TestFactoryConfigurationError");
		System.out.println("6. TestIOError");
		System.out.println("7. TestLinkageError");
		System.out.println("8. TestServiceConfigurationError");
		System.out.println("9. TestThreadDeathError");
		System.out.println("10. TestTransformerFactoryConfigurationError");
		System.out.println("11. TestVirtualMachineError");
		
		System.out.println(" --- CHECKED --- ");
		System.out.println("12. TestClassNotFoundException");
		System.out.println("13. TestCloneNotSupportedException");
		System.out.println("14. TestIllegalAccessException");
		System.out.println("15. TestInstatiationException");
		System.out.println("16. TestInterrupledException");
		System.out.println("17. TestNoSuchFieldException");
		System.out.println("18. TestNoSuchMethodException");
		System.out.println("19. TestReflectiveOperationException");
		
		System.out.println(" --- UNCHECKED --- ");
		System.out.println("20. TestArithmeticException");
		System.out.println("21. TestArrayIndexOutOfBoundsException");
		System.out.println("22. TestArrayStoreException");
		System.out.println("23. TestClassCastException");
		System.out.println("24. TestEnumConstantNotPresentException");
		System.out.println("25. TestIllegalArgumentException");
		System.out.println("26. TestIllegalMonitorStateException");
		System.out.println("27. TestIndexOutOfBoundsException");
		System.out.println("28. TestNegativeArraySizeException");
		System.out.println("29. TestNullPointerException");
		System.out.println("30. TestNumberFormatException");
		System.out.println("31. TestSecurityException");
		System.out.println("32. TestStateException");
		System.out.println("33. TestStringIndexOutOfBoundsException");
		System.out.println("34. TestThreadStateException");
		System.out.println("35. TestTypeNotPresentException");
		System.out.println("36. TestUnsupportedOperationException");
		
		System.out.println(" --- OTHERS --- ");
		System.out.println("37. TestSQLException");
		System.out.println("38. TesteSpringException");
		System.out.println("39. TestFileAlreadyExistsException");
		
		System.out.print("\nEscolha o método de teste de exceção a executar: ");

		int choice = scanner.nextInt();
		scanner.close();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		switch (choice) {
		
		//ERROR
		case 1:
			TestAnnotationFormatError.test();
			break;
		case 2:
			TestAssertionError.test();
			break;
		case 3:
			TestAWTError.test();
			break;
		case 4:
			TestCoderMalfunctionError.test();
			break;
		case 5:
			TestFactoryConfigurationError.test();
			break;
		case 6:
			TestIOError.test();
			break;
		case 7:
			TestLinkageError.test();
			break;
		case 8:
			TestServiceConfigurationError.test();
			break;
		case 9:
			TestThreadDeathError.test();
			break;
		case 10:
			TestTransformerFactoryConfigurationError.test();
			break;
		case 11:
			TestVirtualMachineError.test();
			break;
			
		//CHECKED	
		case 12:
			TestClassNotFoundException.test();
			break;
		case 13:
			TestCloneNotSupportedException.test();
	        TesteSemClone.test();
			break;
		case 14:
			TestIllegalAccessException.test();
			break;
		case 15:
			TestInstatiationException.test();
			break;
		case 16:
			TestInterrupledException.test();
			break;
		case 17:
			TestNoSuchFieldException.test();
			break;
		case 18:
			TestNoSuchMethodException.test();
			break;
		case 19:
			TestReflectiveOperationException.test();
            break;
            
       //UNCHECKED	
        case 20:
        	TestArithmeticException.test();
            break;
        case 21:
        	TestArrayIndexOutOfBoundsException.test();
            break;
        case 22:
        	TestArrayStoreException.test();
            break;
        case 23:
        	TestClassCastException.test();
            break;
        case 24:
        	TestEnumConstantNotPresentException.test();
            break;
        case 25:
        	TestIllegalArgumentException.test();
            break;
        case 26:
        	TestIllegalMonitorStateException.test();
            break;
        case 27:
        	TestIndexOutOfBoundsException.test();
            break;
        case 28:
        	TestNegativeArraySizeException.test();
            break;
        case 29:
        	TestNullPointerException.test();
            break;
        case 30:
        	TestNumberFormatException.test();
            break;
        case 31:
        	TestSecurityException.test();
            break;
        case 32:
        	TestStateException.test();
            break;
        case 33:
        	TestStringIndexOutOfBoundsException.test();
            break;
        case 34:
        	TestThreadStateException.test();
            break;
//        case 35:
//        	TestTypeNotPresentException.test();
//            break;
        case 36:
        	TestUnsupportedOperationException.test();
            break;
            
        //OTHERS
        case 37:
        	TestSQLException.test();
        	break;
        case 38:
        	TestSpringException.test();
        	break;
        case 39:
        	try {
				TestFileAlreadyExistsException.test();
			} catch (FileAlreadyExistsException ex) {
				ex.printStackTrace();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
        	break;
            
		default:
			System.out.println("Escolha inválida.");
		}
	}

}
