package WensdayGurhanReview;

public class DuplicateInArray {

    public static String isDuplicates(int[]arr){
        int []arr1 = {1,2,1,3,2,5,7,8,9,8};
        String empty = "";
        String duplicates ="";
        for (int i=0; i<arr1.length;i++){
            if (!empty.contains(arr[i]+"")){
                empty=empty + arr[i];
            } else {
                duplicates = duplicates+ arr[i];
            }
        }
        return duplicates;

    }

    public static void main(String[] args) {
        int []arr1 = {1,2,1,3,2,5,7,8,9,8};
        System.out.println(isDuplicates(arr1));
    }
}
