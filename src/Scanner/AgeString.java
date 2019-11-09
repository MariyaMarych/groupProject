package Scanner;

import java.util.Scanner;

public class AgeString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String str = input.nextLine();//"I am a big boy who is now xxx years old"
        int indexOfX1 = str.indexOf("now")+4;
        int indexOfX2 = str.indexOf(" years");
        System.out.println("index1 is   " + indexOfX1);
        System.out.println("index2 is   " + indexOfX2);

        String age = str.substring(indexOfX1,indexOfX2);
        System.out.println(age);
        //int ageNum = Integer.valueOf(age);
        //ageNum+=5;
        //System.out.println("In 5 years you will be "+ageNum);








    }
}
