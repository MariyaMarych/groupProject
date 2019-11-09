package Loops;

import java.util.Scanner;

public class OlgaApple {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int count = 0;
        String checked = "";
        char checking_letter = ' ';


        for (int i = 0; i < word.length(); i++) {
            //   checking_letter = word.charAt(i);

            count = 0;
            if (!(checked.contains("" + checking_letter))) {
                for (int j = 0; j < word.length(); j++) {///j is for counting

                    if (checking_letter == word.charAt(j)) {
                        count++;
                    }
                }
                System.out.println(checking_letter + ": " + count);
                checked += checking_letter;

            }

        }
    }




            //checked+= word.charAt(i);
            //count++;


        }




