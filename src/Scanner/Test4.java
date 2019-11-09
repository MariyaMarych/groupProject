package Scanner;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Number of apples: ");
        int numberapples = input.nextInt();

        int numberOfFemale = 85*70 ;
        int numberOfMale= 30*45;
        int result = numberapples - (numberOfFemale+numberOfMale);

        System.out.println("The staff of Cybertek got: " +result+ " apples.");





    }



}
