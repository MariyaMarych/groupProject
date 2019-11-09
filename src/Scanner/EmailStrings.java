package Scanner;


import java.util.Scanner;

public class EmailStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //9) Creating an email. Ask user to enter two strings. Both of these strings should be at least 6 character long.
        // If they are shorter than that print “Invalid data” and program should end.If the information provided is valid,
        // you will take the first 4 characters of first string and combine them with the last three characters of the second string.
        // At the end of your combined string add “@cybertek.com”
        // and print the final string as your created email. > input: “JamesBond”,  Secret> output: jameret@cybertek.com

        System.out.println("Enter 1 String: ");
        String  str1 = input.nextLine();
        System.out.println("Enter 1 String: ");
        String  str2 = input.nextLine();

         if (str1.length()<=6&&str2.length()<=6){
             System.out.println(str1.substring(0,4)+str2.substring(str2.length()-3)+"@cybertek.com");


         }else {
             System.out.println("Invalid data");
         }

    }
}
