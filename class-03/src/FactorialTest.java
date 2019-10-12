public class FactorialTest {
    public static void main(String[] args) {
        int a = 5;
        int b = factorialCalculation(a);
        System.out.println(a + " is " + b);
    }

    public static int factorialCalculation(int m){
        if (m>1){
            return m * factorialCalculation(m-1);
        }else{
            return 1;
        }
    }
}
