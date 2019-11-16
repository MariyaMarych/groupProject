package MondayProjects;

import java.util.Scanner;

public class Stringtask {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //----------------------------------------------------------

        //TASK 1
 /*       System.out.println("Enter word:");
        String str2 = input.nextLine();

        //your code here baNAna
        //----------------------------------------------------------
          int mid = str2.length()/2;
          String OddLetter =(str2.substring(mid,mid+1).toUpperCase());
          String EvenLetter = (str2.substring(mid-1, mid+ 1).toUpperCase());
        if (str2.length() < 3 || str2.length() > 100) {
            System.out.println("Invalid enter: ");
        } else if (str2.length() % 2 == 0) {
            System.out.println(str2.substring(0,mid-1)+EvenLetter+str2.substring(mid+1));
        } else  {
            System.out.println(str2.substring(0,mid)+OddLetter+str2.substring(mid+1));
        }
    }
}
*/


        //----------------------------------------------------------

        //TASK 2

        System.out.println("Enter two words(separate with space):");
        String str3 = input.nextLine();

        //your code here
        //----------------------------------------------------------

        int sum = str3.length();
        System.out.println(sum);

        int space = str3.indexOf(" ");
        String firstLetter = str3.substring(0,1).toUpperCase();
        String secondLetter = str3.substring(space + 1, space + 2).toUpperCase();

        System.out.println(firstLetter + str3.substring(1, space) + " " + secondLetter + str3.substring(space + 2));
    }
}


//Given a String, str , perform the following conditional actions:
//
//Check if str has 3 or more character, if less than 3 or bigger than 100 character, print only Invalid enter
//Convert str to all lower characters
//If number of character is odd convert middle character Upper case
//If number of character is even convert middle two character Upper case (ex: name -> nAMe)
//
//
//Sample Input:
//apple
//Sample Output:
//apPle
//
//Sample Input:
//BANANA
//Sample Output:
//baNAna
//
//Sample Input:
//xy
//Sample Output:
//Invalid enter
//
//Task 2
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



