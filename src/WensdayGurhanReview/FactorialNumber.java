package WensdayGurhanReview;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        //factorial 5! 5*4*3*2*1  --> factorial 5! is product of all integers multiply themselves
        int number =5;
        int index =1;

        for (int i = number; i >0; i--) {
            index =index * i;



        }
        System.out.println(index);


         //1. Factorial is number 5*4*3*2*1
        // 2. declare and assign int index =1
        //3. use loop to start from1 to the end of number included
        //4. in the loop index = index * i!

        Scanner input = new Scanner(System.in);
        int numb = input.nextInt();
        int index1 = 1;
        for (int i = 1; i <=numb ; i++) {
            index1 = index1*i; // 1*2*3*4*5
        }
        System.out.println(index1);



    }
}
