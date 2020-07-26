package String;

import java.util.Scanner;

public class Module {


    public static void main(String[] args) {


        // Write a program that prints out the numbers from 1 to 30 but for numbers which are a multiple of 3, print "FIN"
        // instead of the numberand for numbers which are a multiple of 5, print "RA" instead ofthe number. For numbers which are
        // a multiple of both 3 and 5,print "FINRA" instead of the number.

//        for (int i = 1; i <=30 ; i++) {
//
//
//            if((i%3==0)&&(i%5==0)){
//                System.out.println("FINRA");
//            }
//          else if(i%3==0)  {
//              System.out.println("FIN");
//          }
//            else if  (i%5==0){
//                System.out.println("RA");
//            }else {
//                System.out.println(i);
//            }
//
//        }

//
//        Scanner input = new Scanner(System.in);
//int count = 0;
//        String str = input.nextLine();
//
//            while(str.contains("java")){
//                count++;
//                str=str.replaceFirst("java","");
//            }
//        System.out.println(count);
//
//
//

        Scanner input = new Scanner(System.in);

        String str1 = input.nextLine();
String str2 ="";

        for (int i = str1.length()-1; i >=0; i--) {

            str2+=str1.charAt(i);

        }
        if(str2.equalsIgnoreCase(str1)){
            System.out.println("Palindrome");
        }else {
            System.out.println(str2);
            System.out.println("Not polindrome");
        }

    }

}

