package WensdayGurhanReview;

public class AmstrongNumber {


    public static boolean isAmstrong(int number) {

        String num = number + "";
        int power = num.length();

        int sum = 0;
        for (int i = 0; i < num.length(); i++) {

            int digit = Integer.parseInt(num.charAt(i) + "");
            //153
            sum += Math.pow(digit, power);

        }
        return sum == number;
    }

    public static void main(String[] args) {

       System.out.println(isAmstrong(153));

        int number = 152;
        int temp = number;
        int lastDigit = 0;
        int sumNumCube = 0;

            while (number > 0) {

                lastDigit = number % 10; // to get last digit
                number = number / 10; // to get to the tenth place
                sumNumCube = sumNumCube + (lastDigit * lastDigit * lastDigit);
            }

                if (sumNumCube == temp) {
                    System.out.println("amstrong number" +sumNumCube);

                } else {
                    System.out.println(" not amstrong");
                }
            }
        }







//Armstrong NumberCreate a method that will accept a number (int).
// Return a boolean: true if the given number is an Armstrong number or
// false if it is not— Armstrong number is a number that will take each digit of
// the number and raise it to the power of the number’s length.
// Then the results of each operation will be added together.
// The final result of all the operations will be equal to the original
// number for an Armstrong number. *** In our case we will look at only 3
// digit numbers, but if you want an extra challenge, make your code dynamic so it will check any digit lengthEx:> input: 153
// 1^3 + 5^3 + 3 ^ 3 -> 1 + 125 + 27 = 153> output: true____________
//


// second task
//Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
//for example:
//153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
//
//Output:
//1
//153
//370
//371
//407
//