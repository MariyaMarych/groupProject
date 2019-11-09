package Loops;

import java.util.Scanner;

public class LoopTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*for (int i =1; i<=5; i++) {
            System.out.println("enter name: " + i);
            String name = input.nextLine();
            System.out.println(name);
        }*/
//Write a program that asks from the user infinitely:
//if user enters "hi" your program answers "hello", if user enters "bye" your program says "good bye"
//Flow:
//> hi
//Hello
//> bye
//Good bye
//> james
//Good bye
        for ( ; ;){
            String name= input.nextLine();
            if(name.equals("hi")){
                System.out.println("hello");
            }
            else {
                System.out.println("bye");
                break;
            }


        }






    }
}
