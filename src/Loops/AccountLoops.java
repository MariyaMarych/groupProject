package Loops;

import java.util.Scanner;

public class AccountLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i=0; i<=50; i++){
            if (i%10==3){
                continue;
            }

            System.out.println(i);
        }

// for (int attempts = 0; ; attempts++) {
//            if (attempts == 3){
//                System.out.println("your account is locked");
//                break;
//        }
//
//            System.out.println("Enter your password");
//            String userPass = input.nextLine();
//            if (pass.equals(userPass)) {
//                System.out.println("Welcome to your profile ");
//    }            break;



    }
}
