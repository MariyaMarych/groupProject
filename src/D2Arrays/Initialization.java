package D2Arrays;

public class Initialization {
    public static void main(String[] args) {

        int[][] nums =//declring size use LENGTH
                {
                        {3, 6, 1, 9},
                        {1, 9, 3, 1},
                        {5, 8, 1, 2}

                };

        System.out.println(sumAround(nums, 2, 2));
        System.out.println(hasValue(nums, 2, 3));
        System.out.println(isValid(nums, 2, 3));//checking size use index
        System.out.println(addSum(nums));
        System.out.println(countValueInColon(nums, 1));

        //System.out.println(addSum(nums,2,3));
        // System.out.println(containsColon(nums,1,0));

        nums[0][3] = 0;
        //  System.out.println(nums[2][3]);

        //  for (int row = 0; row < nums.length; row++) {
        //  System.out.print(nums[row][]);
        //     System.out.println();


    }


    //}
//returns true if given colon return asking value(number)
    public static boolean containsColon(int[][] nums, int col, int numner) {
        //to check for value in our colon we have to loop through raw!raw will change--> loop raw
        for (int row = 0; row < nums.length; row++) {
            if (nums[row][col] == numner) {
                return true;
            }
        }
        return false;
    }

    public static int addSum(int[][] nums) {
        int sum = 0;
        for (int raw = 0; raw < nums.length; raw++) {
            for (int col = 0; col < nums[raw].length; col++) {
                sum += nums[raw][col];

            }

        }
        return sum;

    }

    //return number of colon in each nums that contains value;
    public static int countValueInColon(int[][] nums, int value) {
        int count = 0;
        //this will loop through each colon to check if our number is in each colon
        for (int col = 0; col < nums[0].length; col++) {
            if (containsColon(nums, col, value))
                count++;
        }
        return count;

    }

    public static boolean isValid(int[][] nums, int raw, int col) {
/*if (raw <0)return false;//all bad contions!!
if (col <0)return false;
if (raw>nums.length-1)return false;//more than the LAST index
if (col > nums[raw].length-1)return false;//more than the last index

    return true;*/

        return (raw >= 0 && raw < nums.length && col >= 0 && col < nums[raw].length);


    }

    public static int hasValue(int[][] nums, int raw, int col) {

        if (isValid(nums, raw, col))
            return nums[raw][col];
        return 0;
    }


    public static int sumAround(int[][] nums, int raw, int col) {
        return hasValue(nums, raw - 1, col)//element above
                + hasValue(nums, raw, col - 1)//element to the left
                + hasValue(nums, raw + 1, col)//element belove

                + hasValue(nums, raw, col + 1);//element above


    }
}