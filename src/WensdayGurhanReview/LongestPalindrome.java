package WensdayGurhanReview;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindrome {
    public static void main(String[] args) {
String [] words = {"I", "CIVIC", "AND", "RACECAR" ,"LEVEL"};
      //  longestPalindrome(words);
//longestPalindrome2("myracecar");
//longestPalindrome3("my racecar level");

findMaxPalindrome("myracecar level civic");

    }

    public static void longestPalindrome(String [] str){

String reversed = "";
String strLongestPalindrome= "";


        for (String element:str) {
            reversed = "";
            for (int i = element.length()-1; i >=0 ; i--) {
               reversed+=element.charAt(i);
            }
            if(reversed.equals(element)){
                if(element.length() > strLongestPalindrome.length()) {
                    strLongestPalindrome=element;
                }
            }
        }

        System.out.println(strLongestPalindrome);


    }
    //////////////////////////////////////////////////////////////////////////////////
    public static void longestPalindrome2(String s){

        String reversed = "";
        String strLongestPalindrome= "";

String  []str =s.split(" ");
        for (String element:str) {
            reversed = "";
            for (int i = element.length()-1; i >=0 ; i--) {
                reversed+=element.charAt(i);
            }
            if(reversed.equals(element)){
                if(element.length() > strLongestPalindrome.length()) {
                    strLongestPalindrome=element;
                }
            }
        }

        System.out.println(strLongestPalindrome);


    }

    public static void longestPalindrome4(String s) {

        String reversed = "";
        String strLongestPalindrome = "";
            reversed = "";

s = s.toLowerCase().replace(" ","");


            for (int j = s.length() - 1; j >= 0; j--) {
                reversed += s.charAt(j);

            }
//            if (reversed.equals(s)||s.contains()) {
//                if (reversed.length() > strLongestPalindrome.length()) {
//                    strLongestPalindrome = reversed;
//                }
//            }
        System.out.println(strLongestPalindrome);

    }







        public static String longestPalindrome3(String s) {

        int start = 0;
        int end = 0;
        //For each mid point i, use two points (left, right) to check the values on i's left and right sides respectively.
        for (int i = 0; i < s.length(); i++) {
            if (end - start == s.length())
                break;
            char c = s.charAt(i);
            int left = i;
            int right = i;

            while (left >= 0 && s.charAt(left) == c) {
                left--;
            }

            while (right < s.length() && s.charAt(right) == c) {
                right++;
            }

            while (left >= 0 && right < s.length()) {
                if (s.charAt(left) != s.charAt(right)) {
                    break;
                }
                left--;
                right++;
            }

            // left + 1 and right - 1 are actually the start and end index of the
            // Palindromic string
            // we don't set "right" because String.substring function required end index
            // exclusively
            left = left + 1;
            if (end - start < right - left) {
                start = left;
                end = right;
            }
        }
        System.out.println(s.substring(start, end));
        return s.substring(start, end);

    }

    /////////////////////////**********************************

        public static boolean isP (String s){
            StringBuilder sb = new StringBuilder(s);
            return s.equals(sb.reverse().toString());
        }

        public static  String findMaxPalindrome(String input) {
            String last = "";
            List<String> palindromes = new ArrayList<>();
            // loop through string and store all possible palindromes in a List
            for (int i = 0; i < input.length(); i++) {
                for (int j = i + 1; j <= input.length(); j++) {
                    if (isP(input.substring(i, j))) {
                        palindromes.add(input.substring(i, j));
                    }
                }
            }
            String max = palindromes.get(0);
            for (int i = 1; i < palindromes.size(); i++) {
                if (palindromes.get(i).length() > max.length()) {
                    max = palindromes.get(i);
                }
            }
            System.out.println(max);
            return max;
        }

//    public static Set<String> findAllPalindromesUsingBruteForceApproach(String input) {
//        Set<String> palindromes = new HashSet<>();
//        for (int i = 0; i < input.length(); i++) {
//            for (int j = i + 1; j <= input.length(); j++) {
//                if (isPalindrome(input.substring(i, j))) {
//                    palindromes.add(input.substring(i, j));
//                }
//            }
//        }
//        return palindromes;
//    }


    }








