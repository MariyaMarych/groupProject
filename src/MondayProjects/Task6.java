package MondayProjects;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//Write a program to prompt the user to enter the numbers till the user wants (by asking user if he wants to continue) and at the end it should display the count of positive, negative and zeros entered. (Hint: use do while loop)
//
//	Example:
//
//        Input:
//	Enter the number: 9
//	Do you want to continue y/n? y
//	Enter the number: -5
//	Do you want to continue y/n? y
//	Enter the number: 0
//	Do you want to continue y/n? y
//	Enter the number: 66
//	Do you want to continue y/n? n
//
//        Output:
//	Positive numbers: 2
//	Negative numbers: 1
//	Zero numbers:

        int countPositive=0;
        int countNegative0=0;
        int countZero=0;
        char answer = ' ';
        do {
            System.out.println("Enter the number: ");
            int number = input.nextInt();
            if (number>0){
                countPositive++;
            }
            else if (number<0){
                countNegative0++;
            }
            else {
                countZero++;
            }
            System.out.println("Do you want to continue y/n?");
            answer=input.next().charAt(0);

        }while (answer == 'y');
        System.out.println("Positive numbers: "+ countPositive);
        System.out.println("Negative numbers: "+ countNegative0);
        System.out.println("Zero numbers: "+ countZero);
    }
}