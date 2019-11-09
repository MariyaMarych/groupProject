package Scanner;

import java.time.Year;
import java.util.Scanner;

public class Tests {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Month: ");
        int month = input.nextInt();

        System.out.println("Date: ");
        int date = input.nextInt();

        System.out.println("Year: ");
        int year = input.nextInt();

         String result = month + "/"+ date + "/"+ year;
        System.out.println(result);

        year +=5;
        date -=1;

        String result1 = month + "/"+ date + "/"+ year;
        System.out.println(result1);











    }
}
