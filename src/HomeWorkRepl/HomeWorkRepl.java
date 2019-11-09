package HomeWorkRepl;

import java.util.Scanner;

public class HomeWorkRepl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Write a program to calculate the sum of following series where n is input by user.
        //1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n

        Double formula = 0.0;
         int n =input.nextInt();
         for (double i = 1; i <= n; i++){

             formula = formula +(double) (1/i);

         }
        System.out.println(formula);

    }
}
