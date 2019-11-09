package Scanner;

import java.util.Scanner;

public class CalculatorTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 2 numbers; ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        input.nextLine();
        System.out.println("Choose the operation: ");
        String operator = input.nextLine();
        double result= 0;
        boolean valid = true;

        switch (operator) {
            case "+":
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
           break;
            case "-":
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
            case "/":
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;
            case "*":
                result = number1 + number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
            default:
                System.out.println("Invalid operator.");
                valid = false;



        }


    }


}


