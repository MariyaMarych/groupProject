package Arrays;

import java.util.Scanner;

public class NamesArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = {"James", "Sam", "Adam", "Elize", "Jamie", "Benzema", "Sandy"};
        String text = input.nextLine();
        for (int i = 0; i < names.length; i++) {

//            System.out.println(names[i].charAt(names[i].length() - 1));

           // System.out.println(names[i].endsWith("s"));

            if(names[i].toLowerCase().contains(text)){
                System.out.println(names[i]);
            }
        }

    }
}