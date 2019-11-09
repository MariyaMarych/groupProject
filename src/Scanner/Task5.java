package Scanner;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {


        //Vending machine change. Write a program that will ask used to enter a whole number from 1 to 99. User will get back the amount of quarters, dimes, nickels, and pennies that are needed to equal to the provided number.
        //> input
        //Enter your change
        //68
        //> output
        //Your change of 68 was converted to: quarters: 2
        //dimes: 1
        //nickels: 1
        //pennies: 3


        Scanner input = new Scanner(System.in);

        System.out.println("Enter a whole number from 1 to 99: ");
        int num = input.nextInt();


        int quaters = num /25;
        int q1=num%25;
        int dimes= q1/10;
        int d1= num%10;
        int nickels =d1/5;
        int n1=num%5;
        int pennies = n1;


        System.out.println("Your change of "+num+" was converted to: ");
        System.out.println("Quarters: "+ q1);
        System.out.println("Dimes: "+ dimes);
        System.out.println("Nickels "+ nickels);
        System.out.println("Pennies "+ pennies);











    }
}
