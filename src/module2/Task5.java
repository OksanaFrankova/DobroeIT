package module2;

public class Task5 {
    public static void main(String[] args) {
        int x = 5;
        int result = factorial(x);
        System.out.println(result);
    }

    private static int factorial(int x) {
        if (x < 2) {
            return 1;
        }
        return x * factorial(x - 1);
    }
}
