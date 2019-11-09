package Loops;

import java.util.Scanner;

public class Alhpabet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input an alphabet:");
        String str = input.next();

        if (str.length()>1&& str.length()>90f){
            System.out.println("error invalid");
        }
        else if(str.toLowerCase().contains("a,e, o,i,y,u")){
            System.out.println("vowel");
        }
        else {
            System.out.println("constant");
        }
    }
}
