public class SwitchTest {
    public static void main(String[] args) {
        int a1 = 1;
        int a2 = 2;
        switch (a1+a2){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("default");
        }

        String b = "abc";
        switch (b){
            case "abd":
                System.out.println("abd");
                break;
            case "abc":
                System.out.println("abc");
                break;
            case "hig":
                System.out.println("hig");
                break;
            default:
                System.out.println("default");
        }
    }
}
