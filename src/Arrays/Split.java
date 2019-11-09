package Arrays;

import java.util.Arrays;

public class Split {
    public static void main(String[] args) {
        /*String  str = "Java is programmig lanquage";
        String  [] regular = str.trim().toLowerCase().split(" ");
        System.out.println(Arrays.toString(regular));*/
   // 7) Given the String:
        //"Write a program that creates a group of given size thisisabigword”
        //Find the biggest word in your String and print it.

String biggest = "";
        String str = " Write a program that creates a group of given size thisisthegword";
        String [] arr = str.trim().split(" ");// created a arr out of string
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (String element: arr){
            if (element.length() > biggest.length()){
                biggest = element;
            }

        }
        System.out.println(biggest);
        System.out.println("mmm");
         System.out.println("MMM");
    }
}
