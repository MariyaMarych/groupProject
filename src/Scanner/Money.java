package Scanner;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter how much money will you save up?");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5= input.nextInt();

        int number1 = 20;
        int number2 = 35;
        int number3 = 20;
        int number4 = 40;
        int number5 = 90;

        int totalsaveup = num1+num2+num3+num4+num5;

        System.out.println("How much money did you save up? " + totalsaveup +"$");


        int resultSave = totalsaveup* 1/3;
        System.out.println("The amount of money you spent is: " + resultSave +"$");

        int leftmoney = totalsaveup - resultSave;
        System.out.println("This is how much money you have left: "+leftmoney +"$" );














    }
}
