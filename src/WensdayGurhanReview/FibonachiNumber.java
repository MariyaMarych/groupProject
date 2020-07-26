package WensdayGurhanReview;

import java.util.Arrays;

public class FibonachiNumber {
//Fibonacci Create a method that will accept a number (int). Return a String with each Fibonacci number separated by a space. The amount of Fibonacci numbers in the String is determined by the given numberEx:
// > input: 10 > output: 0 1 1 2 3 5 8 13 21 34__________________________________
    //

    public static void main(String[] args) {

        System.out.println( getFibonachi(10));
    }


    public static String getFibonachi(int num){

        int [] arr = new int [num];
        arr [0] = 0;
        arr [1] =1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1]+ arr[i-2];
        }
return Arrays.toString(arr).replace("[","").replace(",","").replace("]","");
    }



}
