package Methods;

import java.util.Arrays;

public class OlgaMethods {
    public static void main(String[] args) {

        calc(9, 3);
        calc(6.7f,6.8f);
        calc(2,4,6,7,8,9);
        int [] arr = {2,6,3,9};
        int [] nums = {4,6,8,9};
        printArrays(arr);
        printArrays(nums);

    }
    public static  void calc (int num1, int num2){
      int division = num1/num2;
        System.out.println("division two integers equals:"+ division);

    }

    public static void calc (float num1, float num2){
        float division  = num2/num2;
        System.out.println("division two double:"+ division);


    }
    public static void printArrays (int [] arr) {

        for (int i = 0; i < arr.length; i++) {

            int result =0;
            result += arr[i];

        }
        System.out.println(Arrays.toString(arr));


    }
    public static void calc (int ... arr){
        {
            int sum =0;
            for (int i = 0; i <arr.length ; i++) {
                sum+=arr[i];
            }
            System.out.println(sum);
        }

    }

    public static void getJa (String str){


    }

    }





