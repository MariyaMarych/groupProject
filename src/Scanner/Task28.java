package Scanner;

import javax.swing.*;
import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       /* System.out.println("enter String");
        String name1= "Cybertek is located in Des Plaines";
        String part = input.nextLine();

     int next = name.indexOf(part)
     print index

        System.out.println(part+" Starts at: "+name1.indexOf(part));*/



      /* String centen = "We will have a picnic when the weather gets nicer";
        System.out.println(centen);
        System.out.println("what char you want to change");
       String change = input.nextLine();
        System.out.println("on what you want to change");
       String changeToWhat = input.nextLine();

       String newChange = centen.replace(change,changeToWhat);
        System.out.println(newChange);*/

      /*  System.out.println("please enter centence");
        String cent1 = input.nextLine();
        String cent2 = input.nextLine();
         int one = cent1.compareTo(cent2);
         if (compare <0){
         sout(cent1);
         else if (compare >0){
         }sout(cent2)
         else
         sout(equal)

        System.out.println(one);*/

       /* System.out.println("enter name");
        String name = input.nextLine();

        if (name.startsWith("a")||name.startsWith("b")){//if(name.chartAt(0)=='a'||name.chartAt(0)=='z')
            System.out.println("your name is cool");
        }else  {
            System.out.println("sorry not a cool name");
        }*/

        String car1 = "maserati, bmw, juguar";
        car1 = car1.toLowerCase();

        System.out.println("enter car model");
        String garage = input.nextLine();

        if (garage.contentEquals("maserati")) {

            System.out.println("itallian");
        } else {
            System.out.println("no itallian");
        }
        if (garage.contentEquals("bmw")) {
            System.out.println("germn");
        } else {
            System.out.println("no german");
        }
        if (garage.contentEquals("jaguar")) {
            System.out.println("british");
        } else {
            System.out.println("no british");
        }
        if (car1.isEmpty()) {
            System.out.println("is empty");
        }
    }
}







