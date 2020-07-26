package WensdayGurhanReview;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1001));


    }

    //Number Palindrome Create a method that will accept a number (long).
// Return a boolean: true if your given number is a palindrome number or
// false if it is not** You know how to do it with String manipulation.
// If you want a challenge do it without using any String in your codeEx: >
// input: 1001> output: true> input: 1234> output: false_________
    //


        public static boolean isPalindrome(long number) {
            long number1 = number;
            long workingNum = number;
            long reverse = 0;

            // num % 10 --> last digit of our number
            // 1001


            while (workingNum != 0) {
                long last = workingNum % 10;// to get last digit
                reverse = reverse * 10 + last;
                workingNum /= 10;


            }


            if(reverse==number){
                return true;
            }else {
                return false;
            }

        }
}

