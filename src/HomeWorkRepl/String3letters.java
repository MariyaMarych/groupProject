package HomeWorkRepl;

public class String3letters {
    public static void main(String[] args) {

        counttriple("ansnhgdkdjfpppmmd");
        System.out.println(counttriple("sjdkdkdjrooomddssow"));

    }

    public static int counttriple(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {//we have to subtr 3 to not go over the bounderies
            if ((str.charAt(i) == str.charAt(i + 1)) && str.charAt(i + 1) == str.charAt(i + 2)) {//compare if 1is == to 2 and 2 is == 3!!
                count++;
            }
        }

        return count;

    }
}
//
/*We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in the given string. The triples may overlap.


        countTriple("abcXXXabc") → 1
        countTriple("xxxabyyyycd") → 3
        countTriple("a") → 0
*/