package module2;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {45, 32, 37, 40};
        int result = sumEven(numbers);
        System.out.println(result);

    }

    private static int sumEven(int[] numbers) {
        int result = 0;
        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            int number = numbers[i];
            if (number % 2 == 0){
                result = result + number;
            }
        }
        return result;
    }
}
