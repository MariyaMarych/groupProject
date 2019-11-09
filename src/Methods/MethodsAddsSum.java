package Methods;

public class MethodsAddsSum {
    public static void main(String[] args) {


       int [] arr = {2,4,6,7,8};
        System.out.println(addSum(arr));



    }



    public static int addSum(int [] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
// for ( int element: arr
 // String s = sum+"";
 // if (s.endsWith "5"){
 // continue;


            if ((arr[i]  % 10 == 5)) {
                continue;
            } else {
                sum += arr[i];

            }
        }
        return sum;
    }

    public static int addSum (int [] name, int a) {
 int sum =0;
 for (int element: name){
     String num =element+"";
     if (num.equals(a+"")){
         sum+=element;
     }

 }
        return sum;



    }


}
