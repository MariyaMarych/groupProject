package Loops;

import java.util.Random;
import java.util.Scanner;

public class LoopClassTask {
    public static void main(String[] args) {

        Random random = new Random();
        String number = "";
        Scanner input = new Scanner(System.in);



        for (int i=1;i<6; i++ ) {
            int randomNumber = random.nextInt(10);
            //if(number.contains(randomNumber+"")){
        //}
          while ((number.contains(randomNumber + ""))){
                System.out.println(randomNumber);
              randomNumber = random.nextInt(10);
            }
          number += randomNumber;

        //int sixNumber = Integer.valueOf(number);

      }
        System.out.println(number);
    }
}
