public class Potato {
    static int price = 5;
    String content = "";
    public Potato(int price, String content){
        this.price = price;
        this.content = content;
    }

    public static void main(String[] args) {
        System.out.println(Potato.price);
        System.out.println("-----------------");
        Potato obj1 = new Potato(10, "青椒土豆丝");
        System.out.println(Potato.price);
        System.out.println(obj1.price);

        System.out.println("-----------------");
        Potato obj2 = new Potato(20, "酸汤肥牛面");
        System.out.println(Potato.price);
        System.out.println(obj2.price);
    }
}
