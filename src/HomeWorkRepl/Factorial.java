package HomeWorkRepl;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Write a program to find the factorial value of any number entered through the keyboard.
        //
        //
        //Example:
        //
        //Input:
        //5
        //Output:
        //Factorial: 120


        int num = input.nextInt();
        int formula = 1;
        for (int i = num; i >0; i--) {
            formula = formula *i;

        }
        System.out.println(formula);
    }
}