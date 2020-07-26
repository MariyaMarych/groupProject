package Loops;

import java.util.ArrayList;
import java.util.List;

public class Anton {

    public static void main(String[] args) {
        String str = "Wooden spoon";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(ch);

        }
        System.out.println();

String str1 = "hip";
        System.out.println(str1.substring(2,3));

List<String> list1 = new ArrayList<>();

list1.add("A");
list1.add("D");
List<String> list2 = new ArrayList<>();
list2.add("B");
list2.add("C");

list1.addAll(1, list2);

 System.out.println(list1);








    }



}
