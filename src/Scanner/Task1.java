package Scanner;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

//)Write a program that will ask user to enter a boolean: true or false.Print the opposite of the boolean they gave.> input:
// true> output: false




        Scanner input = new Scanner (System.in);
        System.out.println("enter true or false");
        Boolean var = input.nextBoolean();

        System.out.println(!var);




    }
}
