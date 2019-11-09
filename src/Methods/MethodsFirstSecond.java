package Methods;

import java.util.Arrays;

public class MethodsFirstSecond {
    public static void main(String[] args) {
      //  System.out.println(firstStringBeginsSecond("namekyky","name"));
        System.out.println(firstStringBeginsSecond("jamesjaj","ja",2));
maxNumber(3,6,7,8,9);
    }


 public static boolean firstStringBeginsSecond (String name1, String name2) {
     String str = "";

     if (name1.startsWith(name2)) {
         return true;
     } else {

         return false;
     }
 }

 public static boolean firstStringBeginsSecond (String name1, String name2, int times) {
     int count = 0;
     for (int i = 0; i < name1.length() - name2.length() + 1; i++) {
         String sub = name1.substring(i, i + name2.length());//checks for 2 char ...i, i+2
         System.out.println(sub);
         if (sub.equals(name2)) {
             count++;
         }

     }
     if (times == count) return true;
     return false;
 }
 public static void maxNumber (int ... arr){//arr ... has to be last one!!
     Arrays.sort(arr);
     System.out.println("The biggest number is "+ arr[arr.length-1]);

 }

}
//Create a method that will accept two Strings. Return true if the first string begins with the second String. Return false if it does not.
//Overload the method to accept a two Strings and a number. Return true if the second String is found inside of your first String the amount of times equal to your number parameter.
//input: “jamesjajl”,”ja", 2
//output: true