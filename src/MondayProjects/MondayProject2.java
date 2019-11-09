package MondayProjects;

import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class MondayProject2 {

//Write a Java program CalculatePhoneBill to calculate the monthly telephone bills as per the following rule:
//Ask user to enter number of calls.
//Minimum $200 for up to 100 calls.
//Plus $0.60 per call for next 50 calls.
//Plus $0.50 per call for next 50 calls.
//Plus $0.40 per call for any call beyond 200 calls.
//
//Examples:
//Enter number of calls: 88
//Your bill is $200.0
//
//Enter number of calls: 120
//Your bill is $212.0
//
//Enter number of calls: 185
//Your bills is $247.5

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of calls: ");
        double num = input.nextDouble();

        double price = 200.00;
        double bill1;
        double bill2;

        double bill3;

        if (num == 100||num<100) {
            System.out.println("your bill is "+price);
        } else if (num > 100&&num<=150){
          bill1= price+(num-100)*0.60;
            System.out.println("Your bill is "+bill1);
         }else if(num>150||num<=200){
            bill2 = price+50*0.60+(num-150)*0.50;
            System.out.println("your bill is "+bill2);
        }else if (num>200){
            bill3 = price+50*0.60+50*0.50+(num-200)*0.40;
            System.out.println("your bill is" +bill3);
        }





    }

}
