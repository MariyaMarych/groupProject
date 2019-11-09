package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String retBook = " ";
        String [] books = {"Book1","Book2","Book3","Book4","Book0"};


            System.out.println("What is the name of one book do u want?");
            String userAnswer = input.nextLine();
            Arrays.sort(books);

            int index = Arrays.binarySearch(books,userAnswer);// where to look in array BOOKS, AND UserAnswer is what we looking for
            if (index >= 0){
                System.out.println("what book are you turning in");
                retBook= input.nextLine();

                books [index]= retBook;

            }
           else if ( index < 0) {//if NEGATIVE -- DOES NOT EXIST;
                System.out.println("sorry buddy");
            }
        System.out.println(Arrays.toString(books));
    }
}
