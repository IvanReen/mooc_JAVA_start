public class FunctionTest {
    public static void main(String[] args) {
        int a, b, c;
        a = 1;
        b = 2;
        c = FunctionTest.add(a, b);
        System.out.println(c);
    }

    private static int add(int a, int b) {
        return a + b;
    }
}
