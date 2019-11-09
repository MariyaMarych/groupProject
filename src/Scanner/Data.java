package Scanner;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Data {
    public static void main(String[] args) {

//        String name ="James";
//        String lastName = "Bond";
//        int age = 45;
//        String locatioin = "London, UK";
//        Boolean isHeOk = true;
        // static - it won't change//
        //Scanner input = new scanner (System.in);

        Scanner input = new Scanner (System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Welcome, " + name + "!");
//        System.out.println("Where are you from " + name + "?" );
//        String counryName = input.nextLine();
//        System.out.println("Where are you going today?");
//        String place = input.nextLine();
//        System.out.println("How old are you?");
//        int age = input.nextInt();
//        System.out.println( "You are " + age + "years old.");
//        String from = input.nextLine();
//        System.out.println(from + " cool place to visit!");
//        System.out.println(name + ", how old are you?");
//        int ageM = input.nextInt();
//        System.out.println(ageM + " age is fun");

        System.out.println(name + ", Are you ready for the concert? ");
         String concert = input.nextLine();


        System.out.println(name +", Great to hear that.");
        System.out.println(" Don't forget the shoes!");
        String answer = input.nextLine();

        System.out.println(name + " What's the weather today?");
        String answer1 = input.nextLine();
        System.out.println();

        System.out.println(name + ", Did you take the umbrella? ");
        String answer2 = input.nextLine();
        System.out.println();

        System.out.println(name + " ,how many people are coming with you?");
        int numOfFriends  = input.nextInt();
        input.nextLine ();

//      BREAK --> input.nextLine() !!!!!!!!!!after you declare int before string
        System.out.println(name + " ,can you provide their names?");
        String names = input.nextLine();
        System.out.println();

        System.out.println(name + " ,You have a lot of friends!");
        System.out.print("Great job, "+name);
        String ans = input.nextLine();

        double rate = input.nextDouble();










        // Runtime exception/error: the worst what could happend. The program is crashed.






    }
}
