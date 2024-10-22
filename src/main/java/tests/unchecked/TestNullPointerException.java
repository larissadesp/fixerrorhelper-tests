package tests.unchecked;

public class TestNullPointerException {
    public static void test() {
        try {
            String str = null;
            str.length();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
