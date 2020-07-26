package WensdayGurhanReview;

public class PrintDuplicate {

//    Create a method that will accept an array and
//    print out all the duplicate values. Input: {1,2,5,15,3,1,5,3,9} - Output: 1,5,3


    public static void main(String[] args) {

        int[] arr = {1,2,5,15,3,1,5,3,9};
        System.out.println(getDuplicate(arr));

    }

    public static String getDuplicate(int[] numbers) {
        String numbersStr = "";

        for (int i = 0; i < numbers.length; i++) {
            int  count=0;
            for (int j = i; j < numbers.length; j++) {

                if (numbers[i] == numbers[j]) {
                    count++;
                }

            }
            if (count >= 2) {
                numbersStr += numbers[i] + " ";
            }


        }
        return numbersStr;
    }


}
