package D2Arrays;

import java.util.Scanner;

public class MaxNumberInArray {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        int max =0;
        for(int i=0 ;i<=rows-1;i++)
        {
            for (int j = 0; j <= cols-1; j++) {

                arr[i][j]= inp.nextInt();
            }
        }//end for rows
       // System.out.println(max);


        //TODO write your code below
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]> max){
                    max = arr [i][j];
                }

            }



        }

        System.out.println(max);


    }//end main
}












//Given a 2d array of ints, find the biggest number(int) in the array
// and print it.