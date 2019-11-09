package Scanner;

import java.util.Random;
import java.util.Scanner;

public class MethodsStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


       /* System.out.println("enter a messsage:");
        String message = input.nextLine();

        if (message.isEmpty()){
            System.out.println("Message is empty");
        }else if (message.length()>=10){
            System.out.println("Message is good");
        }else {



            System.out.println("Message is too short");*/


          /*String user = "test";
           String pass = "test123";

        System.out.println("Enter user's name: ");
        String usersInputName = input.nextLine();


        if (user.equals(usersInputName)){
            System.out.println("Please enter your pass");
            String usersInputPass = input.nextLine();
            if (pass.equals(usersInputPass)){
                System.out.println("welcome");
            }else {
                System.out.println("Invalid password");
            }


        }else {
            System.out.println("Invalid User's name");
        }*/


        System.out.println("Please enter the message ");
        String messageUser = input.nextLine();
        Random random = new Random();

        boolean randomMessage = random.nextBoolean();

        if (messageUser.length() >= 15) {
            System.out.println("sent");
            if (randomMessage) {
                System.out.println("message delivered");
            } else {
                System.out.println("message not delivered");
            }

        } else {

            System.out.println("not sent");
        }
    }
    }