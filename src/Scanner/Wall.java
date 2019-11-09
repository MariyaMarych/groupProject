package Scanner;

import java.util.Scanner;

public class Wall {
    public static void main(String[] args) {



        Scanner input = new Scanner (System.in);
      //  System.out.println("What is the wall color?");
        String color = input.nextLine();
        System.out.println("What is the length?");

        int length = input.nextInt();
        input.nextLine();
        System.out.println("Is it good one?");
        String answer = input.nextLine();
        System.out.println("Color: " + color);
        System.out.println("Length: "+ length);
        System.out.println("Good: "+ answer);//


// to BREAK the line when you are scanning the numbers then you keep using scanner
  //      input.nextLine() ----->to break the line!!!

        //



                String name = input.nextLine();
                double score = input.nextDouble();
                double scoreTriple = score * 3;



                System.out.println("Welcome to Grade"+"'"+"s Page"+", "+ name);
                System.out.println("Your score is "+ scoreTriple);



    }
}
