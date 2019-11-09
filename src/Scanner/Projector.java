package Scanner;

import java.util.Scanner;

public class Projector {
    public static void main(String[] args) {

       /* String weather = "nice";
        if (weather.equals("nice")){
            System.out.println("Go for a walk");
        } else {
            System.out.println("Stay home");
            System.out.println("Watch movie");*/


       /*if ( 4 == 5){
           System.out.println("Ok then");

        }else {
           System.out.println("Thank you");
       }
       if (2<90){
           System.out.println("Perfect");
           System.out.println("Come again");*/
        //   }

        /*int passCode = 3241;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 4 digit passcode: ");
        int number = input.nextInt();

        if (number == passCode) {
            System.out.println("Welcome to iPhone");
        }

        else if( number<0){
            System.out.println("No negative numbers");
        }

        else if(number <1000){
            System.out.println("You entered less digits");
        }
        else if (number>9999){
            System.out.println("You entered more digits");
        }
        else{

        System.out.println("Try again");
        }*/


        Scanner input = new Scanner(System.in);
//        System.out.println("enter 5 numbers: ");

     /*   int number = input.nextInt();

        int result = number%2;

        if  (result==0){
            System.out.println(" even");

        }
                else {
            System.out.println("odd");


            System.out.println("number is " + number );
        }
*/

       /* int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();

        int evens = 0;
        int odds = 0;









        if (num1%2==0){
            evens++;
        }
        else{
            odds++;
        }

        if (num2%2==0){
            evens++;
        }
        else{
            odds++;
        }


        if (num3%2==0){
            evens++;
        }
        else{
            odds++;
        }

        if (num4%2==0){
            evens++;
        }
        else{
            odds++;
        }

        if (num5%2==0){
            evens++;
        }
        else{
            odds++;
        }


        System.out.println("odds: "+odds);
        System.out.println("evens: "+evens);*/

        System.out.println("enter 3 numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();


        if (num1 > num2 && num1 > num3) {
            System.out.println("Max number among 3 digits is: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Max number among 3 digits is: " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("Max number among 3 digits is: " + num3);
        } else if (num1 == num2 && num1 == num3) {
            System.out.println("all numbers are equal");
        }

        }
    }
 //   int max = 0;
//     if (num1>num2 && num1>num3){
 //      max = num1
//if (num2>num1 && num2>num3){
// max = num2