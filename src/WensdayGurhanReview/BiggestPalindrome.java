package WensdayGurhanReview;

public class BiggestPalindrome {
    public static void main(String[] args) {

        System.out.println(isPalindromeTheBiggest("I love java and civic"));
    }


    public static String  isPalindromeTheBiggest(String str) {

        String[] strArr = str.split(" ");
String biggestPalindrome = "";

        for (String element :
                strArr) {

            String reversed = "";
            for (int i =element.length()-1;i>=0; i--) {
                reversed += element.charAt(i);


            }
if(reversed.equals(element)&& element.length()>biggestPalindrome.length() ){
    biggestPalindrome=element;
}

        }

        return biggestPalindrome;

    }
}
