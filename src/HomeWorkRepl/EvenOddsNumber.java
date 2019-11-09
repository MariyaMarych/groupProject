package HomeWorkRepl;

import java.util.Scanner;

public class EvenOddsNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //    Given an array nums, calculate count of even numbers
        //    in nums and print out to console.
        //
        //nums → [2, 1, 2, 3, 4]) → 3
        //nums → [2, 2, 0, 3, 5]) → 3
        //nums → [1, 3, 5, 7, 9]) → 0

        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(),
                input.nextInt(), input.nextInt()};

        int count = 0;
        String evenNumbers = " ";
        String odd = " ";

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenNumbers += nums[i] + ", ";
                count++;

            }else{

            }
        }
        System.out.println("There are " + count + " even numbers " + evenNumbers);

        System.out.println(odd);


    }
}
