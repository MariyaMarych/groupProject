package WensdayGurhanReview;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(reverteseArray(4,67,89,5,87,8)));

        System.out.println(Arrays.toString(getReverse(4,5,7,8,9,0)));
    }

    public static int [] reverteseArray (int ...nums){

        int temp = 0;

        for (int i = 0; i <nums.length/2 ; i++) {

            temp = nums[i];
            nums[i] = nums[nums.length-1-i];
            nums[nums.length-1-i] = temp;

        }


        return nums;
    }

 public static int [] getReverse (int ... arr){

        int [] newArr =  new int [arr.length];

     for (int i =arr.length-1, j=0; i >=0 ; i--,j++) {

             newArr[j] = arr[i];
         }

        return newArr;

 }





}
