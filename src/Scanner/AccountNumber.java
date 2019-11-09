package Scanner;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //11) User is asked to enter an account number.
        // You will check if these account numbers are valid.> If the account number begins with a “2” the
        // account number should be 7 characters long>
        // If the account number begins with a “5” the account number should be 10 characters long—>
        // If the account number does not begin with a 2 or a 5 OR the account number lengths do not meet the expected
        // results print “ Invalid account number”

        System.out.println("enter account number: ");
        String accountnumber = input.nextLine();

        if (accountnumber.startsWith("2")&&accountnumber.length()==7){
            System.out.println("valid 2 account number ");
        }else if(accountnumber.startsWith("5")&&accountnumber.length()==10){
            System.out.println("valid 5 account number");
        }else {
            System.out.println("invalid account number");
        }


    }
}
// if (accountNumber.charAt(0)=='2'{
//if(accountNumber.lenght()==7{
//System("valid 2")
//}else if (account.charAt(0)=='5'{
//system."valid 5
//}else{
//System.out.println("invalid");