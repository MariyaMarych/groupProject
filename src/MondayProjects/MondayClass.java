package MondayProjects;

import java.util.Scanner;

public class MondayClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//Given two strings of lowercase English letters, word1  and word2, perform the following operations:
//
//Sum the lengths of word1 and word2 and print
//Capitalize the first letter in word1 and word2 and print them on a single line, separated by a space.
//
//Sample Input:
//hello world
//
//Sample Output:
//10
//Hello World
//
//
//Sample Input:
//java cool
//
//Sample Output:
//8
//Java Cool
        System.out.println("enter 2 words: ");
     String name = input.nextLine();
        int sum = name.length();
        System.out.println(sum);
        int space = name.indexOf(" ");
        String name1 = name.substring(1,space);
        String name2 = name.substring(space+2);
        String firstLetter = name.substring(0,1);
        String secondletter = name.substring(space+1,space+2);

        System.out.println(firstLetter.toUpperCase()+name1+" "+secondletter.toUpperCase()+name2);





    }
}
