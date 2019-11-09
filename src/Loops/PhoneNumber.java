package Loops;
import java.util.Scanner;
public class PhoneNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String number = input.nextLine();
        boolean validLength = false;
        if(number.length() == 10) {
            validLength = true;
        } else if(number.length() == 12) {
            if(number.charAt(0) == '(' && number.charAt(4)== ')') {
                validLength = true;
                number =   number.replace("(","").replace(")","");
            }
        }
        // We check the length so far
        // if valid length we will check if all are numbers
        // if invalid length don't check
        int count = 0;
        if(validLength) {
            for(int i= 0; i < number.length(); i++) {
                // if (number) -> store
                char num = number.charAt(i);
                if(num >= 48 && num <= 57) {// check from 0 to 9
                    count++;
                }
                //character.isDigit(char c);
            }
            if(count == number.length()) {//if counter also 10,it means every character we checkWas Number
                System.out.println("Valid Number");
            } else {
                System.out.println("Invalid Number");
            }
        } else {
            System.out.println("Invalid number format");
        }
    }
}
