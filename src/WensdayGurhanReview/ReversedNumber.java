package WensdayGurhanReview;

public class ReversedNumber {

  //  Write a method that will accept an integer and return reversed value.
    //  input: 12345, output 54321 (using String reverse, and without String reverse)
  public static void main(String[] args) {
     // System.out.println(reversedValue(12345));
      System.out.println(reverseNumbers2(12345));
      System.out.println(reversedValue(111222));
  }


    public static String  reversedValue(int number){

        String numbers = String.valueOf(number);// 12345
        String reversed= "";

        for (int i =numbers.length()-1;i>=0; i--) {
            reversed+=numbers.charAt(i)+"";


        }


return reversed;

    }


    public static int reverseNumbers2(int number){ ///12345
      int reverse=0;

      while (number!=0) {
          int last = number % 10;
          reverse = reverse * 10 + last;
          number/= 10;

      }



return reverse;

  }




}




