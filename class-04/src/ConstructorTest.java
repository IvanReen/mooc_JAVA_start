class MyPairNumbers{
    int m;
    int n;
    public MyPairNumbers(){
        m = 0;
        n = 0;
    }

    public MyPairNumbers(int a){
        m = a;
        n = 0;
    }

    public MyPairNumbers(int a, int b){
        m = a;
        n = b;
    }
}

public class ConstructorTest {
    public static void main(String[] args) {
        MyPairNumbers obj1 = new MyPairNumbers();
        MyPairNumbers obj2 = new MyPairNumbers(5);
        MyPairNumbers obj3 = new MyPairNumbers(5, 6);
        System.out.println(obj1.m + ", " + obj1.n);
        System.out.println(obj2.m + ", " + obj2.n);
        System.out.println(obj3.m + ", " + obj3.n);
    }
}
