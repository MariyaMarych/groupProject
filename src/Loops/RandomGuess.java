package Loops;

import java.util.Random;
import java.util.Scanner;

public class RandomGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


       int count =0;
       int userGuess;
       Random random = new Random();
       int computerGuess = random.nextInt(101);
       do {
            System.out.println("Enter number: ");
            userGuess = input.nextInt();
            count++;
            if (userGuess > computerGuess) {
                System.out.println("too high");
            } else if (userGuess < computerGuess) {
                System.out.println("too low");
            }else  {
                System.out.println("you guessed right after "+count+ "tries");
            }

        } while (computerGuess!= userGuess  );



       /* System.out.println("enter a letter:");

        char letter = input.nextLine().trim().toUpperCase().charAt(0);
        if (letter >= 65 && letter <= 90) {

            while (letter != 91) {
                System.out.println(letter++);
            }
        } else {
            System.out.println("not valid");
        }*/
    }

}



