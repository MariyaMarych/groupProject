package WensdayGurhanReview;

public class AmstrongNumberMathPower {
    public static void main(String[] args) {

        int number = 153;
        String num = number+"";
        int power =num.length();
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            int digit = Integer.parseInt(num.charAt(i)+""); // we will get 1 out of 153
                sum += Math.pow(digit,power);

            }
            if(sum == number){
                System.out.println(num+" is Amstrong number");

        }else {

                System.out.println("not Amstrong number");
            }
    }
}
