public class Cat implements Animal {
    public void eat(){
        System.out.println("cat eat");
    }

    public void move(){
        System.out.println("cat dump tree");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.move();
    }
}
