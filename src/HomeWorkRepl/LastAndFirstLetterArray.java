package HomeWorkRepl;

import java.util.Scanner;

public class LastAndFirstLetterArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 //  Given a String array words, iterate through each word and print first and last letter of each element in separate lines.
        //
        //Example:
        //
        //words → ["hello", "why", "by", "apple" , "note"]
        //print:
        //       ho
        //       wy
        //       by
        //       ae
        //       ne
//

        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

       /* for (int i = 0; i <  words.length; i++){
           char n = words [i].charAt(words[i].length()-1);
           char f = words[i].charAt(0);
          String  newWords = words [i].substring(0,1);
          //  System.out.println(""+f+n);
           //lastLetter= words[i].substring(words.length-2);

        }
       // System.out.println(newWords);*/

     for (String element: words){
         String name = element.substring(0,1);
         String nameBack  = element.substring(element.length()-1,element.length());
         System.out.println(name+nameBack);



     }




    }
}
