package HomeWorkRepl;

import java.util.Scanner;

public class RepeatedNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //  Given an array nums with 7 integers every element is
        //  repeated twice - except one. Find that element and print it
        //  to console.
        //
        //Example:
        //
        //nums -> [1, 1, 2, 3, 4, 3, 4]
        //         2

        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};


        int element = 0;


        outer:
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; i++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 1) {
                element = nums[i];
                System.out.println(element);
                break outer;
            } else {
                continue;
            }


        }
    }

}








