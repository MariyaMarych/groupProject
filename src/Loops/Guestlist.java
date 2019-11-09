package Loops;

import java.util.Scanner;

public class Guestlist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = "";
        String answer = "";
        String guest_list = "";

        do {

            System.out.println("Please enter guest name");
            name = input.nextLine();
            System.out.println("Do you want to enter new guest name:");
            answer = input.nextLine();
            guest_list += name + ", ";
        } while (answer.equals("yes") || answer.equals("y"));
          System.out.println(guest_list.substring(0,guest_list.length()-2));
}


}