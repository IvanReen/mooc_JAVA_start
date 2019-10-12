public class Tiger implements CatFamily{
    public void eat(){
        System.out.println("tiger eat");
    }

    public void move() {
        System.out.println("tiger move");
    }

    public void climb(){
        System.out.println("tiger climb");
    }

    @Override
    public void familyName() {
        System.out.println("tiger name");
    }
}
