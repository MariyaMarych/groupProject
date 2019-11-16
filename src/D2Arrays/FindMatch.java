package D2Arrays;

import java.util.Scanner;

public class FindMatch {
    public static void main(String[] args) {
        int matches = 0;
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i <= rows - 1; i++) {


            for (int j = 0; j <= cols - 1; j++) {//- 1 because its index


                arr[i][j] = inp.nextInt();

            }///       end for cols
        }//end for rwos
        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col] == arr[row][col + 1]) {
                    matches++;
                }
                System.out.print("matches: " + matches);


            }
        }

    }
}
//your code here








