package Scanner;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number from 1 to 9: ");
        int number = input.nextInt();
        String word=null;
        switch (number){
            case 1:
                word = "one";
                break;
            case 2:
                word ="two";
            case 3:
                word ="three";
                break;
            case 4:
                word ="four";
            case 5:
                word="five";
                break;
            case 6:
                word= "six";
            case 7:
                word="seven";
                break;
            case 8:
                word ="eight";
            case 9:
                word="nine";
                break;
            case 10:
                word = "ten";
            default:
                System.out.println("Not a valid number");


                System.out.println(word);
        }

    }
}
