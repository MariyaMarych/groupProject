package Loops;

import java.util.Scanner;

public class LoopsTask {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter number: ");
        /*String name = input.nextLine();

       for (int i = 1; i<=5; i ++){
            System.out.println(i+" "+" " +name);
        }


        for (int i= 0; i < name.length(); i++ ){
            System.out.println(name.charAt(i)+" for index "+i);//how to get each character..charAt(index)
        }*/


        // for (int i =1; i<=50;i +=2){

        //    System.out.println(i);
        //}
        for (int i = 1; i <= 50; i++) {

            if (i ==20){
                i = 29;
                continue;
            }
            if (i % 2 == 1) {
                System.out.println(i + " number is Odd");

            }
            if (i%2 == 0){
                System.out.println(i+" number is Even");
            }
        }

    }
}