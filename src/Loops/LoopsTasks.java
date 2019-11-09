package Loops;

import java.util.Scanner;

public class LoopsTasks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int accBalance = 1500;

        int transBalance;
        int dec = 0;


        while (accBalance > 0) {
            System.out.println("Enter cost of an item: ");
            transBalance = input.nextInt();

            if (transBalance <= accBalance) {
                System.out.println("Item purchased");
                accBalance -= transBalance;   // accBalance = accBalance - transBalance;

            } else {
                System.out.println("card declined");
                dec++;
            }

            if (dec == 3) {
                System.out.println("card is locked");
                break;
            }
            if (accBalance == 0) {
                System.out.println("You broke");
            }


        }

    }
    }

