package WensdayGurhanReview;

import java.util.ArrayList;

public class PrimeNumber {
    public static void main(String[] args) {
//        System.out.println(isPrime(5));
//       System.out.println(primeNumbers(50));
     //  System.out.println(isPrime(10));
//
//        System.out.println();

     //   getPrimeNumber(100);
getPrimeNumber(50);
    }

    public static ArrayList<Integer> primeNumbers(int num) {


        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i < num; i++) {
            if (isPrime(i)) {//we called a method
                numbers.add(i);

            }
        }
        return numbers;
    }

    public static boolean isPrime(int num) {


        for (int i = 2; i < num; i++) {
// prime number is number that will divisible byitself and by 1
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // second option for prime number using boolean
    public static void getPrimeNumber(int number) {
        boolean check = false;
        for (int i = 1; i <= number; i++) {
            check = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(i + " ");

            }


        }
    }
}









