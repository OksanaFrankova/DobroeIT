package module2;

public class Task1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 300;
        int c = -100;
        int result = sumPositive(a, b, c);
        System.out.println(result);
    }

    public static int sumPositive(int n1, int n2, int n3) {
        int result = 0;
        if (n1 > 0) {
            result = result + n1;
        }
        if (n2 > 0) {
            result = result + n2;
        }
        if (n3 > 0) {
            result = result + n3;
        }
        return result;
    }
}
