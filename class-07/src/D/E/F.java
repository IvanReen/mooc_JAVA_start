package D.E;

import a.B.C;

public class F {
    public static void main(String[] args) {
        System.out.println("i can call C for cooking");
        new C().cook();
    }
    public void cook(){
        System.out.println("i can call C");
        new C().cook();
    }
}
