public class StringConstantTest {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = "ab" + "c";
        String s4 = "a" + "b" + "c";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
    }
}
