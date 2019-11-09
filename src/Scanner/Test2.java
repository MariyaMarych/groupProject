package Scanner;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {

       Scanner input = new Scanner (System.in);

        System.out.println("age: ");
        int age = input.nextInt();
         int retiredAge = 65;
        int result= 65 - age;


        System.out.println("Because you are "+ age+" years old, you will retire in "+ result);//



                String name = input.nextLine();
                double score = input.nextDouble();
                double scoreTriple = score * 3;



                System.out.println("Welcome to Grade"+"'"+"s Page"+", "+ name);
                System.out.println("Your score is "+ scoreTriple);


    }
}
