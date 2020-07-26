package WensdayGurhanReview;

public class CountLettersReplace {

    public static void main(String[] args) {

     String str  = "aaatttnnnppphhhyya";

     while (str.length()!= 0) {
         int counter = 0;
         char letter = str.charAt(0); // we hard code TO GET EACH TIME O INDEX LETTER


         for (int i = 0; i < str.length(); i++) {
             if (letter==str.charAt(i)){ // will check all the letters and count them
                 counter++;
             }
         }

         System.out.println(letter+" = "+counter);
         str = str.replaceAll(letter+"","");
// we reassign our string to new str without thisletters! we get rid of this letters from our string

     }


    }
}
