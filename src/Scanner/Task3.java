package Scanner;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

  //      Write a program that will ask user to enter two numbers.
        //      Declare a boolean with the following value: numberOne == numberTwo.
        //      Print the resulting boolean.

//


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number one: ");
        int numOne = input.nextInt();

        System.out.println("Please enter numTwo: ");
        int numTwo = input.nextInt();

        Boolean task = (numOne == numTwo);
        System.out.println(task);








    }


}
