package module2;

public class Task4b {
    public static void main(String[] args) {
        int x = 5;
        int result = factorial(x);
        System.out.println(result);
    }

    private static int factorial(int x) {
        int result = 1;
        while (x > 1) {
            result = result * x;
            x--;
        }
        return result;
    }
}
