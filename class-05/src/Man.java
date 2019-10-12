public class Man extends Human{
    public void eat(){
        System.out.println("eat two");
    }

    public void run(){
        System.out.println("run");
    }

    public static void main(String[] args) {
        Man man = new Man();
        man.eat();
        man.run();
    }
}
