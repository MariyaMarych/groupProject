package Arrays;

public class misArray {


    public static void main(String[] args) {

        missinhNumbers(2,4,5,6,7,8,9,10,12,13);


    }


    public static void missinhNumbers(int... arr){

 boolean check = true;
        for (int i = 1; i < arr[arr.length-1]; i++) {
            // 1 2 3 4 5 6 7 8 9 10
check=true;
            for (int j = 0; j <arr.length; j++) {
                // 245678

               if(arr[j]==i) {
                check=false;
                break;
               }


            }
if(check) System.out.println("Missing number "+i+" ");


        }





    }
}
