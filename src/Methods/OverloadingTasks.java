package Methods;

import java.util.Arrays;

public class OverloadingTasks {
    public static void main(String[] args) {

           /*
       Old tasks: Create a method that will take a String array and a String.
       Increase your array capacity and add the given String as the last element of the new array.
       Return the new array
New task: Overload the previous method to take a String array,
a String to add to the array,
and number position where the new element should be added
        */
String [] arr = {"anton","dima","mike"};
        System.out.println(Arrays.toString(addArray(arr,"word",2)));



    }

        public static String[] addArray (String arr[],String str ){
            String[] arrNew = new String[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                arrNew[i] = arr[i];
            }
            arrNew[arr.length] = str;
            return arrNew;
        }
        public static String[] addArray (String arr[],String str, int num) {
            String [] newArr = new String[arr.length + 1];
            for (int i = 0 , j = 0; j < newArr.length; j++) {
                if(num == j) {
                    newArr[j] = str;
                }
                else {
                    newArr[j] = arr[i];
                    i++;
                }
            }
            return newArr;


            }


        }







