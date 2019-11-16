package HomeWorkRepl;

public class UnikChar {
    public static void main(String[] args) {
        //test your code
        System.out.println(uniqueChars("wood-spoon"));
    }

    public static String uniqueChars(String str) {
        //TODO: write your below
        String word = "";
        for (int i = 0; i < str.length(); i++) {
            if (!word.contains(str.charAt(i) + "")) {

                word += str.charAt(i) + "";
            }
        }

            return word;
        }

    }
