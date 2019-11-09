package Scanner;

import java.util.Scanner;

public class Weeks {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Choose 3 digit number: ");
        int myNumber = input.nextInt();



       int fullWeeks = myNumber/7;
        int remainderDays = myNumber%7;
        int hours = myNumber*24;
        int min = hours * 60;
        int seconds = min * 60;

        System.out.println("There are "+ fullWeeks + " full weeks in your number.");
        System.out.println("Your remainder is: " +remainderDays);
        System.out.println();
        System.out.println("There are "+ hours + " hours in your number of days.");

        System.out.println("There are "+ min + " minutes in your number of days.");
        System.out.println("There are "+ seconds + " seconds in your number of days.");//




    }




}
