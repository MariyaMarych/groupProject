package HomeWorkRepl;

import java.util.Arrays;

public class PracticeAslan {

    public static void main(String[] args) {

      String name = "Farzona";
      char n =' ';
       char [] arr = new char [name.length()];
        for (int i = 0; i < name.length(); i++) {

            arr [i] = name.charAt(i);
        }
        System.out.println(Arrays.toString(arr));

    }
}
