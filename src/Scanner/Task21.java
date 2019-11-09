package Scanner;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter sentence");
        String sentence = input.nextLine();
        int space = sentence.indexOf(" ");
        String firstword = sentence.substring(0,space);
        String restsentence = sentence.substring(space+1);
        System.out.println(restsentence+" "+firstword);









    }
}
