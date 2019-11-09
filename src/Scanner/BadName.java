package Scanner;

import java.util.Scanner;

public class BadName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your message");
        String name = input.nextLine();
        String badwords = "stupid";
        String badwords1 ="dumb";
        String badword2 = "idiot";

        if(name.contains(badwords)){
            System.out.println(name.replace(badwords,"smart"));
        } else if (name.contains(badwords1)){
            System.out.println(name.replace(badwords1,"smart"));
        }else if(name.contains(badword2)){
            System.out.println(name.replace(badword2,"smart"));
        }else {
            System.out.println("your message was not changed "+name);
        }

//        String checked = message;

//         checked = checked.replace(target"idiot", replacment:"samart");
       // checked = checked.replace(target"idiot", replacment:"samart");
      //  checked = checked.replace(target"idiot", replacment:"samart");//
       //if (name.checked







    }
}
