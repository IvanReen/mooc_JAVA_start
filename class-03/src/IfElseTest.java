public class IfElseTest {
    public static void main(String[] args) {
        int a = 5;
        if (a>1){
            System.out.println(">1");
        }

        if (a>10){
            System.out.println(">10");
        }else{
            System.out.println("!>10");
        }

        if (a>10){
            System.out.println("a>10");
        }else if (a>=5){
            System.out.println("a>=5");
        }else{
            System.out.println("a<5");
        }
    }
}
