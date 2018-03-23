package module3;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 7, 3, 1, 9, 2, 9, 0, 4, 9};
        System.out.println(Arrays.toString(numbers));
        int[] result = transform(numbers);
        System.out.println(Arrays.toString(result));
    }

    private static int[] transform(int[] numbers) {
        Arrays.sort(numbers);
        int maxIndex = numbers.length - 1;
        int maxValue = numbers[maxIndex];
        int[] resultNums = new int[maxValue + 1];

        for (int i = 0; i <= maxIndex; i++) {
            int value = numbers[i];
            int count = resultNums[value];
            resultNums[value] = count + 1;
        }
        return resultNums;
    }
}
