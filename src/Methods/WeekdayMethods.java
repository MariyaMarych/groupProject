package Methods;

import java.util.Arrays;
import java.util.Random;

public class WeekdayMethods {
    public static void main(String[] args) {
        /*Write a method that will tell you if it is the weekday or not.
 1.The method takes a String, Saturday and Sunday are the only weekend days

2.Create a method that will count how many even numbers there is from the given array and return the value

3Create a method that will take a String array and a String.
 Increase your array capacity and add the given String
  as the last element of the new array. Return the new array

4.Create a method that will generate a random int array.
The method takes the size of the array and the bound of the random numbers. Return the random array

5. About 293,329,202 results (0.78 seconds)
Write a method that extracts the result number and returns it as only numbers
Write a method that takes the extracts the result time and returns it as a number and the seconds



         */

        System.out.println(checkIfWeekday("Tuesday"));
        int[] newArr = {1, 5, 4, 6, 8};
        System.out.println(countEvenIntegers(newArr));
        String[] arr = {"mama", "tato", "baba", "sister"};
        System.out.println(Arrays.toString(increaseSizeArray(arr, "vasyl")));
        System.out.println(Arrays.toString(randomInteger(5, 100)));
        System.out.println(differenceMaxAndMin("6675675419"));
        System.out.println(calculator("+",4,6));
        System.out.println(calculator("+",78,89));
        System.out.println(calculator("-",45,13));
        String name1 ="About 293,329,202 results (0.78 seconds)";
        System.out.println(extractsNumbers(name1));
        System.out.println(getSeconds(name1));

        OlgaMethods.calc(6,7);
        OlgaMethods.calc(6,3);
    }

    public static boolean checkIfWeekday(String day) {
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        for (int i = 0; i < weekdays.length; i++) {
            if (day.equalsIgnoreCase(weekdays[i])) {
                return true;
            }

        }
        return false;

    }

    public static int countEvenIntegers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {//for (int num: arr) (num%2 == 0)
            if (arr[i] % 2 == 0) {
                count++;
            }

        }
        return count;
    }

    public static String[] increaseSizeArray(String[] arr, String name) {

        String[] myArr = new String[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            myArr[i] = arr[i];//copy from arr i to NEW ARR myArr
        }
        myArr[myArr.length - 1] = name;

        return myArr;
    }

    public static int[] randomInteger(int size, int bound) {
        Random anyName = new Random();
        int[] myArr = new int[size];
        for (int i = 0; i < size; i++) {
            myArr[i] = anyName.nextInt(bound);

        }
        return myArr;

    }

    public static int differenceMaxAndMin(String numbers) {

        String[] myArr = numbers.split("");//string into array

        int[] arrInt = new int[myArr.length];
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = Integer.valueOf(myArr[i]);//
        }
        Arrays.sort(arrInt);
        int difference = arrInt[arrInt.length - 1] - arrInt[0];
        return difference;

    }

    public static double calculator(String operator, double a, double b) {
        double result = 0;

        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "/":
                result = a / b;
                break;
            case "*":
                result = a * b;
                break;
            default:
                System.out.println("invalid operator");
                return 0;
        }

return result;
    }

   public static int extractsNumbers (String name){
        int result;
        String [] arr = name.split(" ");//
       //1.create NEW ARR
       //2.SPLIT BY SPACE " "
       //3.Take string array element and turn in it into integer by pointing to number of array
       // new str arr we make from our string split method make sure you do space " "!!!
       //we have to extract number from String array via INTEGER.VALUEOF(arr [location])
        result = Integer.valueOf(arr[1].replace(",",""));

        return result;
        }


public static double getSeconds (String name){
        String [] arr = name.split(" ");
        double result =Double.valueOf(arr[3].replace("(",""));
return result;
    }

   }







