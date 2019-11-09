package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how many names do you want to enter");
        int size = input.nextInt();
        input.nextLine();
        String [] names = new String[size];
        for (int i =0; i <= names.length ; i++) {
            System.out.println("enter name");
            String userNames = input.nextLine();
            names[i] = userNames;
            System.out.println(Arrays.toString(names));
        }
    }
}
