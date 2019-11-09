package Arrays;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        int [] nums = {2,5,7,14};
        System.out.println(Arrays.binarySearch(nums,2));
        System.out.println(Arrays.binarySearch(nums,7));
        System.out.println(Arrays.binarySearch(nums,9));//if negative it's not there
        System.out.println(Arrays.binarySearch(nums,1));
        System.out.println(Arrays.binarySearch(nums,14));



    }
}
