package HomeWorkRepl;

import java.util.Scanner;

public class PasswordRequirements {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String userPassword = input.nextLine();


        int countNumber = 0;
        int countCapital = 0;
        int countLower = 0;
        int countSpecial = 0;

        /*

Contain at least one uppercase letter (A-Z)

Contain at least one lowercase letter (a-z)

Contain at least one digit (0-1-2-3-4-5-6-7-8-9)

Contain at least one special character (~`!@#$%^&*()+=_-{}[]\|:;”’?/<>,.)
         */

        if (userPassword.length() < 8) {
            System.out.println("Password should be at least 8 characters");
        } else {
            for (int i = 0; i < userPassword.length(); i++) {
                char r = userPassword.charAt(i);
                if (r >= 65 && r <= 90) {  // Contain at least one uppercase letter (A-Z)
                    countCapital++;
                } else if (r >= 97 && r <= 122) { // Contain at least one lowercase letter (a-z)
                    countLower++;

                } else if (r >= 48 && r <= 57) {//contain numbers
                    countNumber++;
                } else if (r >= 32 && r <= 47) { // Contain at least one special character (~`!@#$%^&*()+=_-{}[]\|:;”’?/<>,.)
                    // Special Characters (32–47 / 58–64 / 91–96 / 123–126)
                    countSpecial++;
                }
            }
            if (countCapital == 0) {
                System.out.println("Password should contain at least 1 uppercase number");
            } else if (countLower == 0) {
                System.out.println("Password should contain at least 1 lowercase number");
            } else if (countNumber == 0) {
                System.out.println("Password should contain at least 1 digit");
            } else if (countSpecial == 0) {
                System.out.println("Password should contain at least 1 of these special characters: ~`!@#$%^&*()+=_-{}[]//|:;”’?/<>,. ");
            }else{
                System.out.println("Your password is accepted");
            }
        }
    }
}