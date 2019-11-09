package Loops;

import java.util.Scanner;

public class LoopClasswork1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int num = input.nextInt();
        input.nextLine();

        System.out.println("add 1?");
        String answer = input.nextLine();

        while (answer.equals("yes") || answer.equals("y")){
            num++;
            System.out.println("would you like to add 1");
            answer =input.nextLine();


        }
        if(answer.equals("no")||answer.equals("n")){

            System.out.println("print result "+num);
        }
        else {
            System.out.println("Did you mean no?");
        }


    }
}