package Loops;

import java.util.Scanner;

public class HomeWork2Look {
    public static void main(String[] args) {
        //Ask user to enter a word.
        // If the first or second or both letter of the word is x, print the word without x(s).
        // If x is the third letter it should be printed. If the first and second are x, both should be ignored.
        //
        //
        //
        //Input:
        //xxode
        //
        //Output:
        //ode
        //
        //
        //Input:
        //oxidex
        //
        //Output:
        //oidex
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word: ");
        String name = input.nextLine();

        if(name.startsWith("xx")) {
            System.out.println(name.substring(2));
        }else if (name.charAt(1)=='x'){
            System.out.println(name.substring(0,1)+name.substring(2));

        }else if(name.startsWith("x")){
            System.out.println(name.substring(1));
        }else{
            System.out.println(name);
        }





    }

}
