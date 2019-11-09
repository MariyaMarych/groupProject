package Scanner;

import java.util.Scanner;

public class IfElse_Task {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String userName = "Mariya";
        String password = "2006";

        System.out.println("Enter username ");
        String name = input.nextLine();

        if (name.equals(userName)) {
            System.out.println("Enter password: ");
            String codePassword = input.nextLine();

            if (codePassword.equals(password)) {
                System.out.println("Login successfull");
            } else {
                System.out.println("wrong passaword");
            }


        }
        else {
            System.out.println("invalid user's name");

        }

    }
}
