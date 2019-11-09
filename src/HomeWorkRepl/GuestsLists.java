package HomeWorkRepl;

import java.util.Scanner;

public class GuestsLists {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 //Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
        //Ask for the first guest name.
        //Then ask does user want to enter one more guest.
        // If yes - take input from.
        //If not - finish the program and print list of the guests.
        //
        //Example of the program:
        //
        //Please enter guest name:
        //Nick
        //Do you want to enter new guest name:
        //yes
        //Please enter guest name:
        //Linda
        //Do you want to enter new guest name:
        //no
        //

        //Guest's list: Nick, Linda
        String answer="",name1;
        String allNames= "";
   do{
       System.out.println("Please enter guest name: ");
       name1 =input.nextLine();
       allNames += name1;
       System.out.println("Do you want to enter new guest name: ");
       answer = input.nextLine();

   } while (answer.equals("yes"));
        System.out.println("Guest's list: "+ allNames);





    }
}
