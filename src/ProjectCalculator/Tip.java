package ProjectCalculator;

import java.util.Scanner;

public class Tip {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        double rate1 = 0.10;
        double rate2 = 0.15;
        double rate3 = 0.20;

        System.out.println("Please enter the amount:");
        double total = input.nextDouble();

        System.out.println("Please enter tip percentage you want to include: ");
        double tipPrecent = input.nextDouble();

        if (tipPrecent == rate1) {
            System.out.println("Total amount including tips is: " +(total+ (total * rate1))+"$");

        } else if (tipPrecent == rate2) {
            System.out.println("Total amount including tips is: " +(total+ (total * rate2))+"$");

        } else if (tipPrecent == rate3) {
            System.out.println("Total amount including tips is: " + (total+(total * rate3))+"$");


        }else {
            System.out.println("Total amount including tips is: " + (total+(total * tipPrecent))+"$");

        }
    }
}
