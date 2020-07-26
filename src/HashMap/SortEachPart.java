package HashMap;

import java.util.Arrays;

public class SortEachPart {
    public static void main(String[] args) {

        String str = "DC45758BATUHCKK78";
        System.out.println(sortEachPart(str));
    }
    public static String  sortEachPart(String str){
String sorted = "";
String each = "";
        for (int i = 0; i <str.length() ; i++) {
            each += str.charAt(i);
if(Character.isLetter(str.charAt(i))){
    if(i==str.length()-1||!Character.isLetter(str.charAt(i+1))){
        //action
        sorted+=sortSubstring(each);
        each="";
    }
}else {
    if (!Character.isDigit(i+1)){
        sorted+=sortSubstring(each);
        each="";
    }
}

        }  
        
        
        return sorted;
    }
    public static String sortSubstring(String str){
String [] str1 = str.split("");
        Arrays.sort(str1);
        return Arrays.toString(str1).replace("[","").replace("]","").replace(",","");

    }





}
