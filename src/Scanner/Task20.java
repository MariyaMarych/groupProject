package Scanner;

import java.util.Random;
import java.util.Scanner;

public class Task20 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Random random = new Random();
        System.out.println("enter number");
        int numberUser = input.nextInt();
        int randomNumber = random.nextInt(10);
        randomNumber++;//this is how i get the range to be 1-10
        System.out.println("Random number is " + randomNumber);
        if (numberUser == randomNumber) {
            System.out.println("Congrats");
        } else if (numberUser < randomNumber) {
            System.out.println("your guess is too low");
        } else if (numberUser > randomNumber) {
            System.out.println("your guess is too high");
        }
        else if (numberUser<1 || randomNumber>10){
            System.out.println("invalid number");
        }
    }
}
