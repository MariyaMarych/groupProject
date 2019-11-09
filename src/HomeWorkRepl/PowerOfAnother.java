package HomeWorkRepl;

import java.util.Scanner;

public class PowerOfAnother {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

 //   Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)
        //
        //Example:
        //
        //Input:
        //2 base   2 to the power of 3 2*2*2
        //3 expondent
        //
        //Output:
        //8

        int baseNumber = input.nextInt();
        int expondentNumber = input.nextInt();
        int newNum=1;


        for (int i = 1; i <= expondentNumber; i++){//how many times we have to loop..3
            newNum = newNum * baseNumber;//newNum that's where we have to store result!!and then * by base again
        }

        System.out.println(newNum);

    }
}
