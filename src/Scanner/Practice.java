package Scanner;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("What's your name? ");

        String name = input.nextLine();
        System.out.println();

        System.out.println("Gender: ");
        char gender = input.nextLine().charAt(0);
        System.out.println();

        System.out.println("What's your age? ");
        int age = input.nextInt();

        System.out.println("What's your phone number?");
        long phoneNumber = input.nextLong();
        System.out.println();

        System.out.println("What's your gpa?");
        double gpa = input.nextDouble();
        System.out.println();

        System.out.println("Name: "+ name);
        System.out.println("Age :"+ age);
        System.out.println("Gender: "+ gender);
        System.out.println("Phone number: "+ phoneNumber);
        System.out.println("GPA: "+ gpa);








    }




}



