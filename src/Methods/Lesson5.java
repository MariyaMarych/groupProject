package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {

        equal("Mother",6);
        int [] nums ={-1,3,-5,-6,-9};//declare an write your numbers
        negative(nums);
        replace(nums,5);
        formatArray(nums);
        transToNumbers("34",5);
        time(3,45,true);
twoString("james is 45","451");


    }
    public static void equal(String name, int a){
        if (name.length()== a){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }


    }

    public static void negative (int [] numbers){// (int ... numbers)-->

        for (int element: numbers){
            if ( element< 0)
            {
                System.out.println(element);
            }
        }

    }

    public static void replace(int [] nums, int a){
                  for (int i = 0; i < nums.length; i++){
                 if (nums[i]<0){
                     nums[i] = a;

                     }

                 }
        System.out.println(Arrays.toString(nums));
    }

    public static void formatArray (int [] numbers){
            //output: [10,9,5,4,3,7,4]
            String result = "[";
            for(int num : numbers) {
                result += num + ", ";
            }
            result = result.substring(0,result.length()-2) + "]";
            System.out.println(result);
        }



    public static void transToNumbers (String name, int a){
      int [] arr = new int [name.length()];
      for (int i = 0; i < name.length(); i++){
          //Integer.valueOf (name.substring(i, i+1)-->  string into integer name into arr[i];
          arr [i] =Integer.valueOf(name.substring(i,i+1))+a;//taking each element --> substring (i,i+1)-->will give you one element because last index not included
      }
        System.out.println(Arrays.toString(arr));

    }

    public static void time(int hours, int minutes, boolean check){

        if ((hours > 0 && hours < 13) && (minutes >= 0 && minutes < 60)){
            System.out.print(hours + ":" + minutes );
            if (check){
                System.out.print(" am");
            }else {
                System.out.print(" pm");
            }

        }else {
            System.out.println("Invalid time information is given");
        }
    }

    public static void twoString (String name, String name1){
        Scanner input = new Scanner(System.in);
        if (name.contains(name1)){
           name = name.replace(name1,"");
            System.out.println(name.trim());
        }else {
            System.out.println("try again");
            String again = input.nextLine();
            if (name.contains(again)){
                name = name.replace(name1,"");
                System.out.println(name.trim());

            }else {
                System.out.println("out of tries");
            }
        }



    }

}
