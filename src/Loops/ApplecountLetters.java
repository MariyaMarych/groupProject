package Loops;

import java.util.Scanner;

public class ApplecountLetters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String newString = "";
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            count = 0;
            if (!newString.contains(str.charAt(i) + "")) {

                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }
                }


            }
            System.out.println(str+" has "+count+""+str.charAt(i));
            newString += str.charAt(i) + "";
        }
        }
    }


