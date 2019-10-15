public class StaticMethodTest {
    int a = 111111;
    static int b = 222222;
    public static void hello(){
        System.out.println("0");
        System.out.println(b);
    }

    public void hi(){
        System.out.println("3");
        hello();
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        StaticMethodTest.hello();
        StaticMethodTest foo = new StaticMethodTest();
        foo.hello();
        foo.hi();
    }
}
