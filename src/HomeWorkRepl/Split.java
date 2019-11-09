package HomeWorkRepl;

import java.util.Arrays;
import java.util.Scanner;

public class Split {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        //Given a String variable email, write code
        // using split method to print email id and domain in
        // separate lines.
        //email -> info@cybertekschool.com
        //Print:
        //Email id: info
        //Email domain: cybertekschool.com
        //
        //
        //If email contains no @ character or multiple @ characters then print invalid email:

        int count = 0;
        // int index = email.indexOf("@");


                for (int i = 0; i < email.length(); i++) {
                    if (email.charAt(i) == '@') {
                        count++;
                    }
                }
                    if (count >= 2) {
                        System.out.println("Email is not valid");

                    } else{

                    String[] str = email.split("@");
                    System.out.println(Arrays.toString(str));
                    System.out.println(str[0] + "\n" + str[1]);

                }
            }
            }





