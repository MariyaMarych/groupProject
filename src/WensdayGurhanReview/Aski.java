package WensdayGurhanReview;

public class Aski {
    public static void main(String[] args) {
        String str = "My name Is Maria";

        int countLower = 0;
        int countUpper = 0;

        for (int i = 0; i < str.length();i++){
            if (str.charAt(i)>='A' && str.charAt(i)<='Z'){
                countUpper++;
            } else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
                countLower++;
            }
        }
        System.out.println("Lower: " + countLower);
        System.out.println("Upper: " + countUpper);
    }
}
