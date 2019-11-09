package Scanner;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

//Write a program that will ask user to enter two characters.
// Declare a boolean with the following value: charOne > charTwo.
// Print the resulting boolean.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a first letter: ");
        char char1 = input.nextLine().charAt(0);


        System.out.println("Please enter second letter: ");
        char char2 = input.nextLine().charAt(0);

        boolean task = (char1>char2);
        System.out.println(task);


    }
}
