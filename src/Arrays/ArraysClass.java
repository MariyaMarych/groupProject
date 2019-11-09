package Arrays;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {

       /* int [] arr = {31,20,25,20,3,48,26,12};

        Arrays.sort(arr);

        System.out.println(arr [0]+" "+ arr [arr.length-1]);*/




       int [] arr = {23,1,34,3,54,54,51};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        String check = " ";
       int max = arr [arr.length-1];
       int count = 0;
       for ( int i = arr.length-1; i >=0; i-- ){
           if (count ==2){
               break;
           }
           if (! check.contains(arr[i]+"")){
               System.out.println(arr[i]);
               check += arr [i] + " ";
               count++;





    //Java will allow you to search for elements in array ONLY IF WE SORTED IT!!!
    //Arrays.binarySearch(arrayName, element)

           }

       }



    }
}
