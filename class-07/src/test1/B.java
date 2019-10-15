package test1;

public class B {
    public void show(){
        A obj = new A();
        System.out.println(obj.v2);
        System.out.println(obj.v3);
        System.out.println(obj.v4);

        obj.showV2();
        obj.showV3();
        obj.showV4();
    }
}
