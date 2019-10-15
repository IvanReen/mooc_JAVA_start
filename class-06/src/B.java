public class B {
    public Integer num = 100;
    public Integer num2 = 128;
    public Character c = 100;

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        System.out.println(a.num == b.num);
        System.out.println(a.num2 == b.num2);

        System.out.println(a.c == b.c);
    }
}
