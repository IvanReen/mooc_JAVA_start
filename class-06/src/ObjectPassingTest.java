class A1{
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

public class ObjectPassingTest {
    public static void main(String[] args) {
        A1 a = new A1();
        a.setId(10);
        System.out.println(a.getId());

        changeValue(a);
        System.out.println(a.getId());
    }

    private static void changeValue(A1 a) {
        a.setId(20);
    }
}
