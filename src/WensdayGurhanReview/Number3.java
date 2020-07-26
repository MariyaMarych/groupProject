package WensdayGurhanReview;

public class Number3 {

    public static void main(String[] args) {
        //takes an integer and return a number

        getThree(33);

    }


    public static void getThree(int number){

        String nums = "";
        int number3 =0;
        for (int i = 0; i <= number; i++) {
            if(i%10==3){
                System.out.println(i);

            }
        }
    }

}
