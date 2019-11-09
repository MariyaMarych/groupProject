package Scanner;

import java.awt.*;
import java.util.Scanner;

public class OctoberMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//User will be given a string: “Sender: <James Bond>. From Number: [202-123-3456]. +Message:
// {“I love programming and problem solving}”> You will separate these parts and print them separately. >
// Print the following: “Sender:  actualSender”“Number: actualNumber”“Message: actualMessage

// You have a value that hold what month it is (October). Ask the user to enter the month from the console.
// If the user’s input matches the expected month put print true,
// but if the input does not match the actual month print false.
// Uppercase and lowercase letters do not matter, we only care about the value.

        /*String month = "October";
        System.out.println("enter the month");
        String userMonth = input.nextLine();

        if (month.equalsIgnoreCase(userMonth)) {

            System.out.println("true");


        }else {
            System.out.println("false");
        }*/

     String str = "Sender:<James Bond>. From Number: [202-123-3456]. +Message:{I love programming and problem solving}";

     int name1 = str.indexOf("<");
     int name2 = str.indexOf(">");
     String name= str.substring(name1+1,name2);
        System.out.println("Sender: "+name);
        int number1 = str.indexOf("[")+1;
        int number2 = str.indexOf("]");
        String number = str.substring(number1, number2);
        System.out.println("Number: "+number);
        int mes1 =str.indexOf("{")+1;
        int mes2 = str.indexOf("}");
        String  message = str.substring(mes1,mes2);
        System.out.println("Message: "+message);











    }
}