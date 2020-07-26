package WensdayGurhanReview;

public class AmstrongNumbersRange {
    public static void main(String[] args) {

        getAmstrong(20000);
    }

    public static void getAmstrong(int range) {

        int lastDigit = 0;
        int num = 0;

        for (int i = 10; i < range; i++) {
            int sum = 0;

            String power1 = i + "";
            int pow = power1.length();
            num = i;
            while (num > 0) {

                lastDigit = num % 10;
                sum += Math.pow(lastDigit,pow);
                num = num / 10;

            }
            if (sum == i) {
                System.out.println(i + " ");
            }
        }


    }
}
