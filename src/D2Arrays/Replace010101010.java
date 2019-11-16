package D2Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Replace010101010 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        String[][] arr = new String[rows][cols];
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= cols - 1; j++) {
                arr[i][j] = inp.next();
                //    if(arr[i][j].equals("")){

            }//end for cols
        }//end for rwos

        //your code here
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (j % 2 == 0) {
                    arr[i][j] = "0";
                } else if (j % 2 != 0) {
                    arr[i][j] = "1";


                }//end main
            }
        }

            System.out.println(Arrays.deepToString(arr));
        }
}



















/*
loop the array and fix it.

        Basically, you get a 2d array with strings, you must make sure all the values are 0,1,0,1



        for example arr is  :
        ["a","d","2",""4]
        ["1","2","3","4"]
        ["2","1","q","0"]
        turn it to:
        ["0","1","0","1"]
        ["0","1","0","1"]
        ["0","1","0","1"]

        hint use modulo (%) operator to get every second iteration: like

        if (j % 2 == 0){/*do somthing*/

