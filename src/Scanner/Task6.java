package Scanner;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        //9) Write a program that asks the user to enter a number between 1 -100
        //Declare a boolean that will check if the entered number is actually within the given range.
        // Make sure the number is more than 0 and less than 101. If the number meets both of those requirements the resulting boolean should be printed as true otherwise if either of them is not meet the result should be false. > input: 200
        //> output: false


        Scanner input = new Scanner(System.in);
        System.out.println("Enter number between 1 to 100: ");
        int num = input.nextInt();

        boolean check = (num >0 && num<=100);
        System.out.println(check);


    }


}
