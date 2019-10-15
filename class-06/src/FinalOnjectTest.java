class FinalObject{
    int a = 10;
}

public class FinalOnjectTest {
    public static void main(String[] args) {
        final FinalObject obj = new FinalObject();
        System.out.println(obj.a);
        obj.a = 20;
        System.out.println(obj.a);

//        final对象不能变更指针
//        obj = new FinalObject();
    }
}
