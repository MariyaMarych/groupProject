package Arrays;

import java.util.Arrays;
import java.util.Random;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Orange Apples Bananas";
        String[] arr = str.split(" ");
        String str1 = "abba";
        String[] arr1 = str1.split("");
        System.out.println(Arrays.toString(arr1));
        String mmm = "";
        String name = "orange";
        for (int i = name.length() - 1; i >= 0; i--) {
            mmm += name.charAt(i);


        }
        System.out.println(mmm);
        Random random = new Random(10);
        int[][] numbers = new int[4][4];
        char [][] chars = new char [2][4];
        System.out.println(Arrays.deepToString(chars));
        System.out.println(Arrays.deepToString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = random.nextInt(10);
             //   System.out.println(Arrays.deepToString(numbers));

            }

        }
        System.out.println(Arrays.deepToString(numbers));
    }
}