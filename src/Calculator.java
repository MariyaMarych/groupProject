import java.text.NumberFormat;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*String inputUser = "";




          while (true){
            System.out.println("Input: ");
            inputUser = input.nextLine().toLowerCase();
            if (inputUser.equals("pass"))
                continue;
            if (inputUser.equals("quit"))
                break;;
              System.out.println(inputUser);*/

        double mortgage =0;
        int principal=0;
        byte years = 0;
        float annualinterestRate=0;
        int monthInYear =12;
        int percent = 100;
        int downPaymentPercent=0;
        float monthlyInterestRate=0;
        int numberOfPayments=0;



        while (true) {
            System.out.println("Principal amount: ");
            principal = input.nextInt();

            if (principal >= 1000 && principal <= 1000_000_000) {

                break;
            }
            System.out.println("Please enter the value between 1000 and 1000.000.000");
        }

        while (true){

            System.out.println("Annual interest rate: ");
            annualinterestRate= input.nextFloat();

            if(annualinterestRate>=1 && annualinterestRate<=30) {
                monthlyInterestRate = annualinterestRate /percent/monthInYear;
                break;
            }
            System.out.println("Please enter numbers from 1 to 30: ");

        }
        while (true){
            System.out.println("Years:");
            years = input.nextByte();
            if (years>=1 && years<=30) {
              numberOfPayments = years*monthInYear;
                break;
            }

            System.out.println("Please enter number from 1 to 30: ");
        }



        mortgage = principal * (monthlyInterestRate* Math.pow(1+ monthlyInterestRate, numberOfPayments)/(Math.pow(1+monthlyInterestRate, numberOfPayments)-1));

           String mortgageFormated = NumberFormat.getCurrencyInstance().format(12345);
        System.out.println("Mortgage: "+mortgage);

    }

}