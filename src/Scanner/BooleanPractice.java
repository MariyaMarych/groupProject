package Scanner;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class BooleanPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Write a program that will ask user to enter two numbers.
        // Declare a boolean with the following value: numberOne >
        // numberTwo. Print the resulting boolean.

        System.out.println("Please enter first numbers: ");
        int numOne = input.nextInt();

        System.out.println("Please enter second number; ");
        int numTwo = input.nextInt();

        Boolean result = (numOne > numTwo);
        System.out.println(result);





    }

}
