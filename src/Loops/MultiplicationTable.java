package Loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);


       /* for (int i = 0; i < 5; i++) {
            int run =3;
        while ((run!=0)){
            System.out.println(run --);
        }
            System.out.println();
        }
    }*/
      /* System.out.println("enter number: ");
        int number = input.nextInt();


          for (int i= 1;i<=number+3;i++){

              for (int j =1; j <=number; j++){
                  System.out.print(" # ");
              }
              System.out.println();

          }*/

        int result;
        outer: for (int i = 1; i <= 10; i++) {

          inner:  for (int j = 1; j <= 10; j++) {

                System.out.println(i+" x "+j+" = "+(i*j));
            }
            System.out.println("-----------");


        }
    }
}