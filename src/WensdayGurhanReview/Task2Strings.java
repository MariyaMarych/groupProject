package WensdayGurhanReview;

public class Task2Strings {

    public static void main(String[] args) {

        System.out.println(mergeArray("mama","858697"));

    }


    public static String mergeArray(String str1, String str2){
String mergerd="";
        for (int i = 0; i <str1.length() || i<str2.length() ; i++) {
            if( i<str1.length() ){
                mergerd+=str1.charAt(i);

            }if(i<str2.length()){
                mergerd+=str2.charAt(i);
            }



        }

return mergerd;


    }


}
