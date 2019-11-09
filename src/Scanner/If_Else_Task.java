package Scanner;

import java.util.Scanner;

public interface If_Else_Task {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1 = input.nextDouble();

        double num2 = input.nextDouble();


        System.out.println( " Enter +, -, *, /,");
        char operator = input.next().charAt(0);// you need to break a line before String afer double
        //if using String --> String operator= input.nextLine();


        if (operator == '+'){//STRING -->if(operator.equals("*")){!!!!!!!!!!!!!!!!!!!!!!!
            System.out.println("Result of " +num1 +operator+ num2 +"is: "+num1+num2);

        }


        else if (operator == '-'){
            System.out.println("Result of " +num1 +operator+ num2 +"is: "+num1+num2);
        }

        else if (operator == '*'){
            System.out.println("Result of " +num1 +operator+ num2 +"is: "+num1+num2);
        }
        else if (operator == '/'){
            System.out.println("Result of " +num1 +operator+ num2 +"is: "+num1+num2);
        }


         else {
             System.out.println("Invalid operator entered. Please try again");

        }

    }


}
