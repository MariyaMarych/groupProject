package Scanner;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {


//Write a program what asks the user to enter two decimal numbers.
// Take these two numbers and perform all the mathematical operations (+,-, *, /, %) on them.
// Print all the results.
//> input 3.5, 6
//> output: Addition: 9.5
//etc for Subtraction, Multiplication, Division, Remainder


        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first decimal? ");
        double numF= input.nextDouble();


        System.out.println("Please enter second decimal? ");
        double numT= input.nextDouble();

        System.out.println("Multiplication: " + numF*numT);

        System.out.println("Addition: " + numF+numT);

        System.out.println("Subtraction: " + (numF-numT));

        System.out.println("Division: "+ numF/numT);

        System.out.println("Remainder: " +numF%numT );









    }


}
