package module2;

public class Task4 {
    public static void main(String[] args) {
        int x = 5;
        int result = factorial(x);
        System.out.println(result);
    }

    private static int factorial(int x) {
        int result = 1;
        for (; x > 1; x--) {
           result = result * x;
        }
        return result;
    }

}
