package Scanner;

import javax.print.attribute.standard.NumberUp;
import java.util.Scanner;

public class Vending_Machine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        /*
Vending machine change. Write a program that will ask used to enter a whole number from 1 to 99.
 User will get back the amount of quarters, dimes, nickels, and pennies that are needed to equal to the provided number.
> input
Enter your change
68
> output
Your change of 68 was converted to: quarters: 2
dimes: 1
nickels: 1
pennies: 3
        mjnjnjn
         */

       /* System.out.println("Enter a whole number from 1 to 99: ");

        int number = input.nextInt();// 88

        int quaters, dimes, nickels, pennies;

        quaters = number/25;// 3 quaters
        int newAmount = number%25;//88-75=13;

        dimes = newAmount/10;// 13/10=1
        newAmount= newAmount%10;// 13-10=3

        nickels =newAmount/5;
        newAmount=newAmount%5;

        pennies= newAmount/1;


        System.out.println("Your change of "+number+" was converted to:\nQuaters: "+quaters+"\nDimes: "+dimes+
                "\nNickels: "+nickels+"\nPennies: " +pennies);/*

      4) Write a program that will ask user to enter a boolean: true or false.
Print the opposite of the boolean they gave.
> input: true
> output: false

        */
        /*System.out.println("Enter true or false: ");
        Boolean mytrues = input.nextBoolean();
        boolean ask = (!mytrues);

        System.out.println(ask);//


      //  Ask user to enter their information using the following datatypes:
        //name - string
        //gender - char
        //age - int
        //phone number - long gpa - double
        //—> After getting the information print the information in this format:
        //Name: givenName Gender: givenGender
        //etc....*/

       /* System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Enter your gender: ");
        String gender = input.nextLine();
        System.out.println("Enter your phone number: ");
        long phonenumber = input.nextLong();
        System.out.println("What's your age? ");
        int age = input.nextInt();
        System.out.println("What's your gpa? ");
        double gpa = input.nextDouble();


        System.out.println("Name: "+name+"\nGender: "+gender


               +"\nPhoneNumber: "+phonenumber+"\nAge: "+age+"\nGPA: " +gpa);

               ////////////

              Prompt the user to enter the amount as a decimal number, such as 11.56.
2. Convert the amount (e.g., 11.56) into cents (1156).
3. Divide the cents by 100 to find the number of dollars. Obtain the remaining cents using the cents remainder 100.
4. Divide the remaining cents by 25 to find the number of quarters. Obtain the remaining cents using the remaining cents remainder 25.
5. Divide the remaining cents by 10 to find the number of dimes. Obtain the remaining cents using the remaining cents remainder 10.
6. Divide the remaining cents by 5 to find the number of nickels. Obtain the remaining cents using the remaining cents remainder 5.
7. The remaining cents are the pennies.
8. Display the result.
*/


       System.out.println("Enter decimal number: ");
        double number = input.nextDouble();//11.56
         int newAmount= (int)(number*100); // 11.56*100=1156 cents;
        System.out.println( newAmount);
        int dollars,quarters, dimes, nickels, pennies;

       /* dollars = newAmount/100;  // 1156cents/ 100 --> 11.56$dollars,but int dollars -->11$, the rest in remaindol
        int remaining = newAmount%100;// 1156%100-->to find 56 cents remaining!!;
        quarters = remaining/25; // to find out quaters in the remaining amount -->2 quaters-->56cents;
        remaining = remaining%25;// to find out remaining 56%25-->6 cents;
        dimes = remaining/10; // 6 cents / 10-->to find out dimes?
        remaining = remaining%10;
        nickels = remaining /5;//to find out nickels -->6/5;
        remaining = remaining%5;//to find remaining out-->6%5-->1//remaining will be cents left!!*/


       dollars = newAmount/100;// 11$
       quarters = (newAmount%100)/25;// 2q
       dimes = ((((newAmount%100)/25))%25)/10;
       nickels = (((((newAmount%100)/25)%25)/10)%10)/5;
       pennies = newAmount;








        System.out.println(dollars);
        System.out.println(quarters);
        System.out.println(dimes);
        System.out.println(nickels);





       /* System.out.println("The number "+ number+ " will be converted to: \nDollars: "+dollars+ "\nQuarters: "+quarters+"\nDimes: "+dimes+"\nNickels: "+nickels+"\nPennies: "+remaining);*/


























    }





}