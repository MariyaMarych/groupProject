package Loops;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class LoopsClasswork {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your address: ");
        String adress = input.nextLine();
        int count =0;

        while (adress.contains("il"))
        {

            System.out.println("Enter your address:");
            adress =input.nextLine();
            count++;
        }

        System.out.println(count);








    }

}
