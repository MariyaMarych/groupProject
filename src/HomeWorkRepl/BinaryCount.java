package HomeWorkRepl;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int[] binaryCount = new int[8];

        int[] arr =   {128, 64, 32, 16, 8, 4, 2, 1}; // num = 4
        for (int i = 0; i <= 7; i++) {
            if (number / arr[i] == 1) {
                binaryCount[i] = 1;
                number = number - arr[i];
            }
        }
        System.out.println(Arrays.toString(binaryCount));







    }
}
