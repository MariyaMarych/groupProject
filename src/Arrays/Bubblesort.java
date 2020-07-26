package Arrays;

import java.util.Arrays;

public class Bubblesort {


    public static void main(String[] args) {

        System.out.println(Arrays.toString(bubbleSort(5,8,0,6,2,4,6,2,8,9)));


    }
    public static int [] bubbleSort(int ... arr){
//4234455

        int temp=0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 1; j < arr.length; j++) {

                if(arr[j-1]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }



            }




        }


return arr;
    }


}
