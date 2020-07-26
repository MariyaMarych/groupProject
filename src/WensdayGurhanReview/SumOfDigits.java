package WensdayGurhanReview;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 12345;
        String num =n+"";

        int sum = 0;

        for (int i = 0; i < num.length(); i++) {

            sum+= Integer.parseInt(num.charAt(i)+"");

        }

        System.out.println(sum);

    }
}
