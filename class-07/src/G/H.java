package G;

import D.E.F;

public class H {
    public static void main(String[] args) {
        System.out.println("i can call F for cooking");
        new F().cook();
    }

    public void cook(){
        System.out.println("i can call F");
        new F().cook();
    }
}
