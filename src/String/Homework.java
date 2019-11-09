package String;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter word: ");
        String str =input.nextLine();
        String lastChar= str.substring(str.length()-1);

        String newStr = lastChar+str+lastChar;
        System.out.println(newStr);


    }
}
