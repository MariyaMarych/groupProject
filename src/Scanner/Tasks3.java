package Scanner;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Tasks3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the minutes: ");
        int minutes = input.nextInt();

        int hour = minutes/60;
        int remMinutes = minutes%60;

        System.out.println(minutes +" minutes is " + hour + " hour and "+ remMinutes + " minutes");






    }
}
