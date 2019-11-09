package Scanner;



import java.util.Scanner;

public class Task_Celsius {

    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);

    System.out.println("Enter the degree in Celsium: ");




/*
(Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in a double value from the console,
then converts it to Fahrenheit and displays the result. The formula for the conversion is as follows:
    fahrenheit = (9 / 5) * celsius + 32 */

    int celsiumdegree = input.nextInt();

    double tempF = (9 / 5) * celsiumdegree + 32;

System.out.println(celsiumdegree+" degrees Celsium is "+tempF+" degrees in Fahrenheit");






   }

}
