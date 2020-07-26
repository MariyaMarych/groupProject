package WensdayGurhanReview;

public class AnagramReplace {
    public static void main(String[] args) {
        System.out.println(isAnagram("liste n","silen t"));

    }

    public static boolean isAnagram(String str1, String str2) {

str1= str1.toLowerCase().trim().replace(" ", "");
str2= str2.toLowerCase().trim().replace(" ","");



        int count = 0;
        if (str1.length() != str2.length()) {
            return false;
        }
            for (int i = 0; i < str1.length(); i++) {


                for (int j = 0; j < str2.length(); j++) {


                    if (str1.charAt(i) == str2.charAt(j)) {
                        count++;
                        str2 = str2.replaceFirst(str2.charAt(j) + "", "");
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