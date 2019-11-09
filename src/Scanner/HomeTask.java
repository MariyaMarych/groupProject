package Scanner;

import java.util.Scanner;

public class HomeTask {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
       /* System.out.println("please enter the word: ");
        String n1 = input.nextLine();
        boolean b = n1.startsWith("x");

        if(b){

            System.out.println(n1.substring(1));

}*/

       /* System.out.println("enter word");
       String  s = " Welcome";
       String  s1 = " welcome";
       Boolean isEqual = s.equals(s1)&&s.equalsIgnoreCase(s1);
       int a= s.length();
       int k = s1.length();
       int x =a-k;
       boolean time = a ==k&&s.equalsIgnoreCase(s1);
       boolean b = s.endsWith("AAA");

           System.out.println(b);*/

       /*String  word = "jaVa ";
       String fixed = word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();
        System.out.println(fixed);

        String str = "Java";
        str = str.replace('a','o');
        System.out.println(str);

        String str2 = word.replace("ja","va");
        System.out.println(str2);
         String  str3 = "Kevin fell from his bike";
         int from = str3.indexOf(" from");
         String str4 = str3.substring(0,from);
        System.out.println(str4.substring(from)+" "+from);*/


          String str = "    java       cool      ";
        System.out.println(str.trim());

        String  str1 = "Java";
        Boolean b = str1.startsWith("va");
        System.out.println(b);

        Boolean f = str1.endsWith("va");

        System.out.println(f);
        System.out.println(!f);












    }
}
