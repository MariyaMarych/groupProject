package variablesBatch14;

import java.util.Random;
import java.util.Scanner;

public class DaysNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       /* Random random = new Random();
        int randomNumber = random.nextInt(26);
        System.out.println("Random number "+ randomNumber);
        randomNumber += 65;
         char letter = (char)(randomNumber);
        System.out.println("My number is " + randomNumber);
        System.out.println("Your letter is " + letter );*/


       /* System.out.println("Enter your age: ");
        int age = input.nextInt();

        if (age>=30){
            System.out.println("Welcome to the bulding");
        }else if (age>100||age<=0){
            System.out.println("Not a valid age");
        }
        else{
            System.out.println("sorry try again when 30");
        }  */


        System.out.println("enter 3 numbers: ");

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 == num2 && num1 == num3) {
            System.out.println(" the numbers are equal");
        }
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the biggest");
        }
        {
            if (num2 > num1 && num2 > num3) {
                System.out.println(num2 + " is the biggest");

            } else {
                System.out.println(num3 + " is the biggets");


            }
        }
    }
}
