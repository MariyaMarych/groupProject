package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Garage {
    private static Object ArraysToString;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many cars do you have?");
      int n =input.nextInt();
      input.nextLine();
      String [] myGarage =  new String [n];// n size
      for (int i = 0; i < myGarage.length;i++ ) {
          System.out.println("Enter car " +(i+1));//starts from o, thats why plus1

          myGarage[i] = input.nextLine();
          System.out.println(Arrays.toString(myGarage));


      }





    }
}
