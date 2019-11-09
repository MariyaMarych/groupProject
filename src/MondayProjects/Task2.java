package MondayProjects;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        // Write a Java program that prompts the user to enter word and prints number of occurrences of each characters.
        //
        //Input:
        //Enter word: apple
        //
        //Output:
        //a:1 p:2 l:1 e:1
        //
        //Input:
        //Enter word: Java
        //
        //Output:
        //j:1 a:2 v:1
        // apple ---> apple;

        Scanner input = new Scanner(System.in);

        int count = 0;
        // TASK 1

        System.out.println("Enter word:");
        String letters = " ";

        String str = input.next().toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            count = 0;
            if (!letters.contains(str.charAt(i) + "")) {

                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        letters += str.charAt(i) + " ";
                        count++;
                    }
                }
                System.out.println(str.charAt(i) + ": " + count + ", ");

            }

        }


    }

}
