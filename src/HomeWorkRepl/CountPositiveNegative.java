package HomeWorkRepl;

import java.util.Scanner;

public class CountPositiveNegative {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        plus_minus(arr);
    }

    // Create a method here and call it "plus_minus"


    public static void plus_minus(int ... arr){
        int countPositive=0;
        int countNegative=0;
        int countZeros = 0;

        for (int element : arr){
            if (element < 0 ){
                countNegative++;
            //    System.out.print("negative: "+countNegative);

            }else if (element > 0) {
                countPositive++;
               // System.out.print("posityive: "+ countPositive);

            } else if (element == 0){
                countZeros++;
               // System.out.print("zeros: "+ countZeros);

            }

        }
        System.out.println("positive: "+countPositive+", negative: "+countNegative+", zeros: "+countZeros);
    }

}

















//Create a method called plus_minus that gets an array of ints (int[]), it outputs how many negative , positive and zero numbers are in the array.
//
//for example:
//
//plus_minus (new int[]{1,2,55,-9,-2,0});
//
//will output:
//positives:3, negatives:2, zeros:1