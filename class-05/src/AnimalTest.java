public class AnimalTest {
    public static void haveLunch(Animal a){
        a.eat();
    }

    public static void main(String[] args) {
        Animal[] as = new Animal[4];
        as[0] = new Cat();
        as[1] = new Dog();
        as[2] = new Dog();
        as[3] = new Cat();

        for(int i=0; i<as.length; i++){
            as[i].move();
        }

        for(int i=0; i<as.length; i++){
            haveLunch(as[i]);
        }

        haveLunch(new Cat());
        haveLunch(new Dog());

        haveLunch(
                new Animal() {
                    public void eat() {
                        System.out.println("class eat");
                    }

                    public void move() {
                        System.out.println("class move");
                    }
                }
        );
    }
}
