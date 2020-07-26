package Arrays;

import java.util.Arrays;

public class add2Arrays {
    public static void main(String[] args) {
        int[] a = {2, 5, 6, 4};
        int[] b = {27, 5, 6, 6};


        int c[] = new int[a.length + b.length];

        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);

        System.out.println(Arrays.toString(c));


        //  System.out.println(Arrays.toString(addArray(a,b)));

        //  System.out.println(bigDiff(5,6,8,2));


    }

    public static int[] addArray(int[] a, int[] b) {

        int[] arr = new int[a.length + b.length];

        for (int i = 0, j = 0; i < arr.length; i++) {

            if (i < a.length) {
                arr[i] = a[i];

            } else {
                arr[i] = b[j++];
            }


        }

        return arr;
    }

    public static int bigDiff(int... nums) {

        int max = Math.max(nums[0], nums[1]);
        int min = Math.min(nums[0], nums[1]);

        for (int i = 0; i < nums.length; i++) {

            max = Math.max(max, nums[i]);

            min = Math.min(min, nums[i]);
        }

        return max - min;

    }


}
