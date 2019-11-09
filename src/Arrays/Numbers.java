package Arrays;

import java.util.Arrays;

public class Numbers {
    public static void main(String[] args) {
        int[] nums = {4, -2, 5, -3, -20, 30};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                nums[i] = 0;
            }

        }
        System.out.println(Arrays.toString(nums));
    }
}