package HomeWorkRepl;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {

        //  submit
        //Instructions from your teacher:
        //Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message (ERROR. It should be exactly 1 character length!).
        //
        //
        //Input:
        //Input an alphabet: b
        //Output :
        //Input letter is Consonant

        Scanner input = new Scanner(System.in);
        System.out.println("Input an alphabet:");
        String str = input.next();
        str = str.toUpperCase();

        // your code
        // ------------------------------------------

        if (str.length() > 1) {

            System.out.println("ERROR. It should be exactly 1 character length!");
        } else if (str.length() == 1) {

            for (int i = 0; i < str.length(); i++) {
                char num = str.charAt(i);
             if (str.charAt(i)>= 'A'&& str.charAt(i)<='Z'){
                    if (num == 'a' || num == 'A' || num == 'e' || num == 'E' || num == 'O' || num == 'o' ||
                            num == 'U' || num == 'u' || num == 'I' || num == 'i' || num == 'Y' || num == 'y') {
                        System.out.println("Input letter is Vowel");
                    } else {
                        System.out.println("Input letter is Consonant");

                    }

                }
            }


        }
    }
}