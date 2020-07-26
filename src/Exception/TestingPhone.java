package Exception;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestingPhone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Phone phone = new Phone();
        System.out.println("Enter version");
        try {
            phone.version = input.nextDouble();
        } catch (InputMismatchException e) {

            System.out.println("invalid input");
            System.out.println(e.toString());
        }
        input.nextLine();
        System.out.println("Enter brand: ");
        try {


            phone.brand = input.nextLine();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        System.out.println("Enter how many numbers");
        int numbers = input.nextInt();

        phone.contacts = new double[numbers];

        try {
            for (int i = 0; i < numbers; i++) {
                try {
                    System.out.println("Enter number" + (i + 1));

                    phone.contacts[i] = input.nextDouble();
                }catch (InputMismatchException e ){
                    System.out.println("Invalid number, not stored try again");
                    continue;
                }

            }

        } catch (InputMismatchException e) {
            System.out.println(e.toString());
            System.out.println("enter incorrect amount");
        }
try {
    System.out.println(Arrays.toString(phone.contacts));
}catch (InputMismatchException e){
    System.out.println();
}


//ake two numbers from the user, then divide the first number from the second number. Print the result.
//-> Case: if either number entered is not a double you could get exception
//-> Case: if the second number is 0 you will get exception
//
        System.out.println("enter number one");
        try{

            double firstNumber = input.nextDouble();
            System.out.println("enter number two");

            double secondNumber = input.nextDouble();
            System.out.println("Input invalid");
            System.out.println(phone.toString());



            System.out.println(firstNumber+"/"+secondNumber+"="+(firstNumber/secondNumber));
        }catch (InputMismatchException E){
            System.out.println("Input invalid");
            System.out.println(phone.toString());
        }catch (ArithmeticException e){
            System.out.println("You can't divide by zero");
        }






    }
}
