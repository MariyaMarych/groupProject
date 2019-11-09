package HomeWorkRepl;

import java.util.Scanner;

public class LagestElement {
    public static void main(String[] args) {
//  Given the array words, it will print the word with the largest length. Assume that there are no 2 words with longest length
//
//Example:
//words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
//prints jaaaaavvaaaaaaaaaa


        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
             int biggestLength =0;// start what to compare to and then store in..
             String bigWord= "";

    /*    for(int i = 0; i < 5;  i++) {
            words [i] = input.nextLine();
            if ( words[i].length() > biggestLength){// to compare to the biggest length
                biggestLength = words[i].length();//to store the biggestLength we assigh new length if its biggest
                bigWord = words [i];//we take our big word and store in String

            }
        }
        System.out.println(bigWord);*/

    for (String element: words){
        element = input.nextLine();
        if (element.length()> biggestLength){
            biggestLength = element.length();
            bigWord = element;
        }


    }
        System.out.println(bigWord);







    }







    }

