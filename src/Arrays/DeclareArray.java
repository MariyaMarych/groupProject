package Arrays;

public class DeclareArray {
    public static void main(String[] args) {
  /* int [] nums = {45,23,6,-3,66} ;
        Arrays.sort(nums);
        System.out.println(Arrays.binarySearch(nums,-3));*/

//8) Given the String: “It started to snow in Chicago”
//Reverse each individual word and print the result
//> expected output:
//tI detrats ot wons ni ogacihC
        int i, j;
       String str ="Gime me your money";
       String [] word = str.trim().split(" ");
       String finalStr ="";
       for (String element: word){

           String reverse ="";
           for (i = element.length()-1;i>= 0; i--){
               reverse += element.charAt(i);

           }
           finalStr += reverse + " ";
       }
        System.out.println(finalStr);

    }
}