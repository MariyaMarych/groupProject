package WensdayGurhanReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Constants {

    public static void main(String[] args) {

        String name = "mariya";

        List<Character> vowels = Arrays.asList('a', 'o', 'e', 'i', 'u', 'y');
        List<Character> constants = new ArrayList<>();


        for (char i = 'a'; i <= 'z'; i++) {
            if (!vowels.contains(i)) {
                constants.add(i);
            }
        }

        System.out.print(vowels+"\n");
        System.out.println(constants);


        int countVowes = 0;
        int countConstant = 0;

        for (int i = 0; i < name.length(); i++) {
            if(vowels.contains(name.charAt(i))){
                countVowes++;
            }else {
                countConstant++;
            }

        }

        System.out.println("Numnber of contants in my word "+name+ "is "+ countConstant );
        System.out.println("Numnber of vowels in my word "+name+ "is "+ countVowes);

    }

}


