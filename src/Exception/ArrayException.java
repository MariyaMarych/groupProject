package Exception;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayException {

    public static void main(String[] args) {

      int [] arr ={1,2,3,4,5};

        Scanner input = new Scanner(System.in);
        int indexUser = 0;
        int numberUser =0;
        System.out.println("Enter what index you want to change");
        try{
             indexUser = input.nextInt();
            input.nextLine();

        }catch (InputMismatchException e){
            System.out.println("Invalid input");
        }

        System.out.println("enter number you want add");
        try {
            numberUser = input.nextInt();
arr[indexUser]= numberUser;

        }catch (InputMismatchException e){
            System.out.println("invalid input");
        }
        finally {
            System.out.println(Arrays.toString(arr));
        }
    }
}
