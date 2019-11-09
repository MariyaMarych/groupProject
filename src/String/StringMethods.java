package String;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name");
        String name = input.nextLine();
        String firstLetter = name.substring(0,1);
        firstLetter = firstLetter.toUpperCase();
        String  restOfWord = name.substring(1).toLowerCase();
        System.out.println(firstLetter+restOfWord);




    }

}
