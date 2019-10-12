public class ArgumentPassingTest {
    public static void main(String[] args) {
        int a = 1, b = 2;
        swap(a, b);
        System.out.println(a + ", " + b);

        MyNumber obj1 = new MyNumber();
        MyNumber obj2 = new MyNumber();

        obj2.num = 10;
        swap(obj1, obj2);
        System.out.println(obj1 + ", " + obj2);
    }

    public static void swap(int a, int b){
        int s = a;
        a = b;
        b = s;
    }

    public static void swap(MyNumber obj3, MyNumber obj4){
        int s = obj3.num;
        obj3.num = obj4.num;
        obj4.num = s;
    }
}
