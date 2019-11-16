package D2Arrays;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {

    public static void main(String[] args) {
        int[][] nums = randomArray(3, 3);
//        System.out.println(Arrays.deepToString(randomArray(3, 5)));
        printLn(nums);
        System.out.println(differenceSumOfDiagnals(nums));
    }

    public static int[][] randomArray(int a, int b) {

        Random random = new Random();
        int[][] number = new int[a][b];

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                number[i][j] = random.nextInt(10);
            }
        }

        return number;


    }

    public static int differenceSumOfDiagnals(int[][] arr) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            sum1 += arr[i][i];
            sum2 += arr[j][i]; //arr[arr.length-1-i][i]
        }
        return Math.abs(sum1 - sum2);//abs--> returns whole number without looking on ---, so will give it us POSITIVE
    }

    public static void printLn(int[][] b) {
        for (int i = 0; i < b.length; i++) {
            System.out.println(Arrays.toString(b[i]));

        }

    }
}

//Create a method that will take 2d array and return the difference between the sum of the diagonals