package tests.checked;

class MyClass implements Cloneable {
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	public void display() { }
}

public class TestCloneNotSupportedException {
	public static void test() {
		MyClass original = new MyClass();
		try {
			MyClass clone = (MyClass) original.clone();
			clone.display();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
