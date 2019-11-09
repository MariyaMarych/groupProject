package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numUser = input.nextInt();

        int numFac = numUser*(numUser-1)*(numUser-2)*2*1;

        System.out.println(numFac);


    }
}
