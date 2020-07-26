package WensdayGurhanReview;

public class RemoveCommonChar {
    public static void main(String[] args) {
        System.out.println(removeCommonChar("javaeep", "apvple"));
    }

    public static String removeCommonChar(String str1, String str2) {

        String unigue = "";

        for (int i = 0; i < str1.length(); i++) {
                if (str2.contains(str1.charAt(i) + "")) {
                    str2 = str2.replaceAll(str1.charAt(i) + "", "");
                    str1 = str1.replaceAll(str1.charAt(i) + "", "");
                    i--;
                }
            }
            unigue = str1 + str2;
        return unigue;
    }
}







