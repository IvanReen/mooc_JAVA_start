public class B extends A{
    public B(){
        System.out.println("3333");
    }

    public B(int a){
        super(a);
        System.out.println("4444");
    }

    public static void main(String[] args) {
        B obj1 = new B();
        System.out.println("====");
        B obj2 = new B(10);
    }
}
