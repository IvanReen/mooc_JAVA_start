public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("dog eat");
    }

    @Override
    public void move() {
        System.out.println("dog move");
    }
}
