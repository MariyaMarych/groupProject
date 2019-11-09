package MondayProjects;

import java.util.Scanner;

public class MondayProject3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //  Given a String, str , perform the following conditional actions:
        //
        //Check if str has 3 or more character, if less than 3 or bigger than 100 character, print only Invalid enter
        //Convert str to all lower characters
        //If number of character is odd convert middle character Upper case
        //If number of character is even convert middle two character Upper case (ex: name -> nAMe)
        //
        //
        //Sample Input:
        //apple
        //Sample Output:
        //apPle
        //
        //Sample Input:
        //BANANA
        //Sample Output:
        //baNAna
        //
        //Sample Input:
        //xy
        //Sample Output:
        //Invalid enter

        System.out.println("Enter word: ");
        String str2 = input.nextLine();

       if (str2.length()>3&&str2.length()<100){
           str2.toLowerCase();
           if(str2.length()!=0){
               int mid = str2.length()/2;
               String middle = str2.substring(mid,mid + 1).toUpperCase();
               System.out.println(str2.substring(0,mid)+middle+str2.substring(mid+1));
           }else{
               int mid = str2.length()/2;
               String middle1 = str2.substring(str2.length()/2-1,mid)+str2.substring(str2.length()/2,mid+1).toUpperCase();
               System.out.println(str2.substring(0,mid-1)+middle1+str2.substring(mid+1));
           }

       }else {
           System.out.println("Invalid number");
       }


    }
}