package WensdayGurhanReview;

public class MissingNumberArray {

    public static void main(String[] args) {


        int[] arr = {1, 3, 5, 8,7};
        int k = arr[0];
        boolean check = false;

        for (int i = 0; i < arr.length; i++, k++) {
            check=false;
            while (arr[i] != k) {
check=true;
            }
            if(check){

            }
            System.out.println(k);

        }

//
//        int x= 0;
//        int y = 0;
//        for (int z = 0; z <5 ; z++) {
//            if((++x>2)||(++y>2)){
//                ++x;
//            }
//        }
//        System.out.println(x+" "+y);
//

    }
}



