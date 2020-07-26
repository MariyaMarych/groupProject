package WensdayGurhanReview;

import java.util.Arrays;

public class ReverseEachElementString {
    public static void main(String[] args) {


        String str = " When Once home today";
        String[] arr = str.split(" ");

        String reversed = "";

        for (String element: arr
        ) {

            for (int i = element.length()-1; i >=0 ; i--) {
                reversed += element.charAt(i);

            }
reversed+=" ";
        }
        String [] str1 = reversed.trim().split(" ");
        System.out.println(Arrays.toString(str1));
    }
}