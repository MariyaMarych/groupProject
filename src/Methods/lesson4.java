package Methods;

import java.util.Scanner;

public class lesson4 {
    public static void main(String[] args) {
        countWord("there is no more snow outside");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter some String");
        String str = input.nextLine();
        countWord(str);
    }

    public static void countWord(String str){
        String [] arr = str.trim().split(" ");
        System.out.println("The number of words in the sentence is " + arr.length);
        }

    }
