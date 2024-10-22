package tests.error;

import java.util.ArrayList;
import java.util.List;

public class TestVirtualMachineError {
	public static void test() {
		List<Object> list = new ArrayList<>();
		try {
			while (true) {
				list.add(new Object());
			}
		} catch (VirtualMachineError e) {
			e.printStackTrace();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
