package Scanner;

import javax.swing.*;
import java.util.Scanner;

public class AccpuntNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter account number: ");
        String account = input.nextLine();


        if (account.startsWith("2")&&account.length()==7){
            System.out.println("valid 7 characters long");
        }
        else if (account.startsWith("5")&&account.length()==10){
            System.out.println("valid 10 characters long");
        }else {
            System.out.println("Invalid account number");
        }




    }
}
