package Loops;

import java.util.Scanner;

public class HomeworkRepl {
    public static void main(String[] args) {

        //    Write for and while loops so that they go through the odd integers
        //    (from 1 to 19), keeping track of the sum of these integers at each stage,
        //    and printing the sum at each stage.
        //
        //Expected Output:  1 4 9 16 25 36 49 64 81 100
        /*int sum =0;
        for (int i = 1; i <= 20; i += 2) {

            sum += i;


            System.out.print(sum +" ");
        }
//Write for and while loops so that they add up
// the even numbers between 1 and 20 and prints it
//
//Expected Output:  110*/
       /* int sum =0;int count =0;int result=0;
        for (int i = 1; i <= 20; i += 2) {


                 result +=i ;
                 System.out.print(result+" ");
         }
*/
//2) [IQ] Palindrome: A word that is the same read forwards and backwards. User takes a word from the console. Print true if the word is a palindrome. Print false if the word is not palindrome.
//> input: civic
//> output: true

       Scanner input = new Scanner(System.in);
        System.out.println("enter word");
        String userword = input.nextLine();
        for (int i = userword.length()-1;i>=0 ;i--) {
            String newStr = "";
            newStr = "" + userword.charAt(i);
             if (userword.equals(newStr)){
                System.out.println(true);
            }
else{
                 System.out.println(false);
             }

       /*3) Write a program that asks the user to enter a word. Print out how many times a character is in the given word.
> input: apple
                > output:
        apple has 1 a
        apple has 2 p
        apple has 1 l
        apple has 1 e

        */
        /* System.out.println("enter a word");
         String word = input.nextLine();
        int count =0; char c;
         for (int i=0 ;i <= word.length()-1; i++ ){
              c= word.charAt(i);
             if (word.charAt(i). ){
                  count++;

                 System.out.println(word+" has " + );
             }*/



        }
        }
    }
