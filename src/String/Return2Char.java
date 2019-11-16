package String;

public class Return2Char {
    public static void main(String[] args) {

        String str1 = "edited";

      //  if (str1.charAt(0) == str1.charAt(str1.length() - 2) && (str1.charAt(1) == str1.charAt(str1.length() - 1))) {

          //  System.out.println("true");
            // if(str1.substring(0,2).equals(str1.substring(str1.length()-2))){
            //  System.out.println(str1.substring(0,2).equals(str1.substring(str1.length()-2)));
      //  } else {
            System.out.println("false");
        }

        }





//Given a string, return true if the first 2 chars in the
// string also appear at the end of the string, such as with "edited".
//
//
//frontAgain("edited") → true
//frontAgain("edit") → false
//frontAgain("ed") → true