package Arrays;

import java.util.Arrays;

public class ArraysTest1 {
    public static void main(String[] args) {

   //   Declare and initialize double array for prices.
        //Store following prices:
        //45.99, 23.5, 11.50, 33.33, 99.99.
        //Print the values then change the last element to 112.89.
        //Print all values again
// int [] numbers = {2,3,4,5,6}
    Double [] numbers = {45.99, 23.5, 11.50, 33.33, 99.99};

        System.out.println(Arrays.toString(numbers));
        numbers[numbers.length-4] = 112.89;
        System.out.println(Arrays.toString(numbers));



    }
}
