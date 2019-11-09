package MondayProjects;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//   Accept a string and if it is palindrome, print "Palindrome", if not print "Not Palindrome"
//(It should be case-insensitive).
//
//Example 1
//Input:
//civic
//Output:
//Palindrome
//Example 2
//Input:
//java
//Output:
//Not Palindrome
//Example 3
//Input:
//Mom
//Output:
//Palindrome

        String str = input.nextLine();
        String strNew = "";

        for (int i = str.length()- 1; i >= 0; i--) {
            strNew += str.charAt(i);
            System.out.println(strNew);
        }
            if (strNew.equals(str)) {
                System.out.println("palindrome");
            } else {
                System.out.println("not palindrome");
            }

        }


    }

