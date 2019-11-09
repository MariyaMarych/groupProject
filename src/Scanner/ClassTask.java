package Scanner;

import java.util.Scanner;

public class ClassTask {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your mass (kg): ");
        double mass = input.nextDouble();
        System.out.println("Enter your height (m): ");
        double height = input.nextDouble();

        double formula = mass / (height * height);

        if (formula < 18.5) {
            System.out.println("underweight");

        } else if (formula >= 18.5 && formula <= 25) {

            System.out.println("normal weight");


        } else if (formula >= 25 && formula <= 30) {

            System.out.println("overweight");

        } else if (formula >= 30) {
            System.out.println("obese");
        }
    }

}
