package Arrays;

import java.util.Arrays;

public class anton1 {

    public static void main(String[] args) {

String str = "pop,mamagkhk,javaj,tato,sasha,olga,oleksij,iop,lol";

String [] arr = str.split(",");

String word = "";
int index= arr[0].length();

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].length()<index){
                index=arr[i].length();
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].length()==index){
                word+=arr[i]+",";
            }
        }




        String [] arr2 = word.split(",");

        System.out.println(Arrays.toString(arr2));
        System.out.println("MMM");
        System.out.println("Anton");





//
//
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(10);
//        numbers.add(45);
//        numbers.add(67);
//        numbers.add(500);
//
//
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//
//        for (Integer element:numbers) {
//            if(element>max){
//                max=element;
//            }
//
//
//                if(element<min){
//                    min=element;
//
//
//            }
//
//
//        }
//
//        System.out.println("max number "+max);
//        System.out.println("min number "+min);


    }
}