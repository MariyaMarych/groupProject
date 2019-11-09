package Loops;

import java.util.Scanner;

public class LoopdsClassWork {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int sum =0;
        double average= 0;
        int count = 0;

        for (int i=number1; i<=number2; i++){
            count++;
          sum = sum + i;//sum+=i
            average = sum/count;

        }
        System.out.println("sum"+sum);
        System.out.println("Average "+average);
    }
}
