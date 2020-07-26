package WensdayGurhanReview;

public class AnagramDifferent {


    public static void main(String[] args) {

        System.out.println(isAnagram("book", "koob"));
    }

    public static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        str1 = str1.trim().toLowerCase().replace(" ", "");// listen
        str2 = str2.trim().toLowerCase().replace(" ", "");// silent


        int count = 0;
        for (int i = 0; i < str1.length(); i++) {

            for (int j = 0; j < str2.length(); j++) {

                if (str1.charAt(i) == str2.charAt(j)) {
                    count++;
                    str2= str2.replaceFirst(str1.charAt(i)+"", " ");
                    break;
                }
            }
            if (str1.length() == count) {
                return true;
            }
        }


        return false;
    }


}
