public class Woman extends Human {
    public void eat(){
        System.out.println("eat little");
    }

    public void huazhuang(){
        System.out.println("美美哒");
    }

    public static void main(String[] args) {
        Woman w = new Woman();
        w.eat();
        w.huazhuang();
    }
}
