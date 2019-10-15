package test2;


import test1.A;

public class D extends A {
    public void show(){
        System.out.println(v3);
        System.out.println(v4);

        showV3();
        showV4();

        A obj = new A();
        System.out.println(obj.v4);

        obj.showV4();
    }
}
