package Scanner;

import java.util.Scanner;

public class HomePractise {
    public static void main(String[] args) {


        System.out.println("Please enter:");
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        boolean b = n.length()>=7;
        boolean b2= n.length()<=10;


        /*if(n.contains("a")&&n.length()<5){
            System.out.println("A Perfect");
        }else if (n.contains("b")&&n.contains("a")&&b&&b2){
            System.out.println("B Perfect");
        }else if (!n.contains("a")&&(!b)&&(!b2)&&n.contains("b")){
            System.out.println("Perfect");
        }else if (n.contains("a")&&(!b)||n.contains("b")){
            System.out.println("");
        } else {
            System.out.println("Sorry");
        }*/





        if(n.contains("a")&&n.length()<5){
            System.out.println("A Perfect");
        }else if (n.contains("b")&&b&&b2){
            System.out.println("B Perfect");
        }else if (!n.contains("a")&&(n.length()<5)||!n.contains("b")&&(!b)&&(!b2)){
            System.out.println("Perfect");
        }else if (n.contains("a")&&(!b)&&(!b2)){
            System.out.println(" ");
        } else {
            System.out.println("Sorry");
        }





    }



}












