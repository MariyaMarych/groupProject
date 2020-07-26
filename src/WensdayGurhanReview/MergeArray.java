package WensdayGurhanReview;

import java.util.Arrays;

public class MergeArray {

    public static void main(String[] args) {

      int [] arr = {1,4,5} ;
      String [] str = {"a","b","y","y","f"};

      int  L = arr.length + str.length;

      int j = 0;

      String [] arr1 = new String[L];

        for (int i = 0; i < arr.length || i<str.length ; i++) {
            if(i< arr.length){
                arr1[j++] = arr[i]+"";
            }

            if(i<str.length){
                arr1[j++] = str[i];
            }

        }

        System.out.println(Arrays.toString(arr1));




    }
}
