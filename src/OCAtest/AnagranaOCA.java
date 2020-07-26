package OCAtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AnagranaOCA {

    public static void main(String[] args) {

        getAnagram("listen", "silent");
        System.out.println(getPrime(9));
        System.out.println(getPrimeNumbers(50));

        String name = "Mariya";
        String reversed = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reversed += name.charAt(i);

            String str1 = "listen";
            String str2 = "silent";

            if(!str1.equals(str2)){
                System.out.println("not anagram");
            }

            char [] str1Char = str1.toCharArray();
            char [] str2Char = str2.toCharArray();

            Arrays.sort(str1Char);
            Arrays.sort(str2Char);


        }
        //   System.out.println(reversed);


        String name1 = "Oksana";
        String[] arr = name1.split(" ");
        //  String [] rev = new String[name1.length()];
        String rev = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            rev = arr[i];
        }

        System.out.println(rev);
    }


    public static void getAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            System.out.println("not anagaram");
        }
        char[] str1Char = str1.toCharArray();
        char[] str2Char = str2.toCharArray();

        Arrays.sort(str1Char);
        Arrays.sort(str2Char);

        if (Arrays.equals(str1Char, str2Char)) {
            System.out.println("those are anagrams");
        }


    }

    public static boolean getPrime(int number) {

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;

            }

        }

        return true;

    }

    public static List<Integer> getPrimeNumbers(int number) {

        List<Integer> prime = new ArrayList<>();
        for (int i = 2; i < number; i++) {

            if (getPrime(i)) {
                prime.add(i);
            }


        }

        return prime;

    }


    public static void getNumberOfLetters(String userWord) {
        Scanner input = new Scanner(System.in);
        userWord = input.nextLine();
// apple
        //apple
        // a
        String checked = "";
        int count = 0;
        for (int i = 0; i < userWord.length(); i++) { // we grabbed a
            count = 0;

            if (!checked.contains(userWord.charAt(i) + "")) {
                checked += userWord.charAt(i); // we put it al unique;
                for (int j = 0; j < userWord.length(); j++) { //to get the count of all unique
                    if (userWord.charAt(i) == userWord.charAt(j))
                        count++; // it will get us count of all a in the word

                }
                System.out.println(userWord + "has" + count + userWord.charAt(i)); // to print apple has 1 a

            }
        }


    }




}