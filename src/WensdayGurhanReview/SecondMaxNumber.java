package WensdayGurhanReview;

public class SecondMaxNumber {


    public static void findString(String name, int n){
        System.out.println(name+n);
    }

     public static int findSecondMaxNumber(int [] arr){
         int max = 0;
         int secondMax =0;
         for (int i = 0; i < arr.length; i++) {
             if(arr[i]>max){
                 secondMax = max;//
                 max=arr[i];
             }
                 if(arr[i]<max && arr[i]>secondMax ){
                     secondMax=arr[i];
                 }
             }
         return secondMax;
     }


    public static void main(String[] args) {

         int [] arr ={120,1,69,4,6,100,6,7,7,8,9,67,45,98,68};
        System.out.println(findSecondMaxNumber(arr));






    }





}
//Find Second Max Number Create a method that will accept an int array.
// Return the number which is the second to biggest number./**
// Do not use sort method **Ex:> input: 1,3,22,44,12,30,32,54,31> output: 44____________
//