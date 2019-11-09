package MondayProjects;

import java.util.Scanner;

public class GiftClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int giftCard = 100;
        int times = 3;
        int spent = 0;
        while (giftCard >= 0) {
            System.out.println("Enter cost of item:");
            int itemPrice = input.nextInt();

            if (itemPrice <= giftCard) {
                spent += itemPrice;
                times--;
                if (spent == 100) {
                    times++;
                    System.out.println("You bought " + times + " items, spent $" + spent + " and done shopping");
                    break;
                } else if (times == 0) {
                    System.out.println("You bought 3 items, spent $" + spent + " and done shopping");
                    break;
                }
                System.out.println("You spent $" + spent + " so far" + "\n" + "You may buy up to " + times + " items");
                giftCard -= itemPrice;
            } else {
                System.out.println("You can't spend more than $100");
            }
        }
    }

}



