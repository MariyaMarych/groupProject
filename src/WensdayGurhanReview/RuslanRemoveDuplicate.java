package WensdayGurhanReview;

public class RuslanRemoveDuplicate {
    public static void main(String[] args) {

int [] arr = {1,3,33,1,4,5,1,6,7,1,2,3,4,33,44};

String str = "";


        for (int i = 0; i <arr.length ; i++) {

            if(!str.contains(arr[i]+"")){
                str+=arr[i]+" ";

            }
        }

        System.out.println(str);



    }
}



//    int[] arr = {2, 4, 1, 6, 3, 2, 2,1,1};
//    String str = "";
//        for (int i = 0; i < arr.length; i++) {
//        if (!str.contains("" + arr[i])) {
//        str += arr[i] + " ";
//        }
//        }
//        String[] array = str.split(" ");
//        System.out.println(Arrays.toString(array));