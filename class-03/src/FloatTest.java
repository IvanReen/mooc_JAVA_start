public class FloatTest {
    public static void main(String[] args) {
        float f1 = 1.23f;
        double d1 = 4.56d;
        double d2 = 4.56;

        System.out.println(f1);
        System.out.println((double)f1);
        System.out.println(d1);
        System.out.println((float)d2);

        System.out.println(f1==1.229999999f);
        System.out.println(f1-1.229999999f);
        System.out.println(d2==4.559999999999999999d);
        System.out.println(d2-4.559999999999999999d);
    }
}
