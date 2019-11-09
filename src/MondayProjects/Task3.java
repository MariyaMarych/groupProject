package MondayProjects;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//
////Given a String, str2 , (str2 may contain characters,
//// numbers and special characters) perform the following conditional actions:
////Check if str2 has 3 or more characters, if less than 3 or bigger
//// than 100 character, print only Invalid enter
////Get only numbers from str2 and make one string then print
//// (Hint: use charAt(), ASCII table to verify specific character is
//// number or not number)
////
////Input: av$5yit8
////Output: 58
////
////Input: abc23fd5hk7
////Output: 2357
//
        System.out.println("Enter: ");
        String second = input.nextLine();


        if (second.length() < 3 || second.length() > 100) {
            System.out.println("Invalid enter");
        } else {
            for (int i = 0; i < second.length(); i++) {
                if (second.charAt(i) >= 48 && second.charAt(i) <= 57) {//from 0 to9;
                    System.out.print(second.charAt(i));
                }
            }

        }
    }
}

