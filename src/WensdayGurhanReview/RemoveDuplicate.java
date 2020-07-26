package WensdayGurhanReview;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicate {


    public static void main(String[] args) {

        int arr[] = {4,44, 6, 7, 4, 7, 9, 6, 1, 21, 3,22,44};
        System.out.println(Arrays.toString(removeDuplicate(arr)));

    }

    public static int[] removeDuplicate(int... arr) {

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!numbers.contains(arr[i]))
                numbers.add(arr[i]);
        }
        int[] newArr = new int[numbers.size()];

        for (int i = 0; i < numbers.size(); i++) {

            newArr[i] = numbers.get(i);

        }
        return newArr;
    }
}
//        int [] numbers={1,2,3,1,2,4,5,5};
//        System.out.println(Arrays.toString(removeDuplicate(numbers)));
//    }
//    public static  int[] removeDuplicate(int ... arr){
//        ArrayList<Integer> numbers=new ArrayList<>();
//        for(int i=0; i<arr.length;i++){
//            if(!numbers.contains(arr[i])){
//                numbers.add(arr[i]);
//            }
//        }
//        int [] nums=new int[numbers.size()];
//        for(int i=0; i<numbers.size(); i++){
//            nums[i]=numbers.get(i);
//        }
//        return nums;
//
//    }
//}
