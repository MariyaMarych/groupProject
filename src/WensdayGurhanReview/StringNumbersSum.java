package WensdayGurhanReview;

public class StringNumbersSum {
    public static void main(String[] args) {
        System.out.println(SumDigits("mkakshsd678"));
    }

    public static int SumDigits(String str){
 int sum= 0;
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isDigit(str.charAt(i))){

                sum+= Integer.parseInt(str.charAt(i)+"");
            }



        }

       return sum;
    }

}
