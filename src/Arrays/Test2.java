package Arrays;

import java.util.Arrays;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[50];


        for (int i = 0; i < numbers.length; i++) {

            int newrandom = random.nextInt(100) + 1;
            numbers[i] = newrandom;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[49]);
    }
}