package Scanner;

import java.util.Scanner;

public class SwitchString {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char name = input.nextLine().charAt(0);

        switch (name){
            case 'a':
            case 'A':
                System.out.println("Excelent!");
                break;
            case 'b' :
            case 'B' :
                System.out.println("Great!");
             break;
            case 'c':
            case 'C':
                 System.out.println("Okay");
                 break;
            case 'd':
            case 'D':
                System.out.println("You can do better!");
                break;
            case 'f':
            case 'F':
                System.out.println("Something you need to change");
                break;
            default:
                System.out.println("not a valid grade");

        }



    }
}
