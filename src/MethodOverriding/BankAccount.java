package MethodOverriding;

public class BankAccount {
    public double balance;
    public int accountNumber;
    public String name;


    public void info() {
        System.out.println("Balance on this account number " + this.balance);
        System.out.println("Account number is " + this.accountNumber);
        System.out.println("Name on this account number is " + this.name);
    }

    public void transfer(double amount) {
        System.out.println("Money is transfered: " + amount);
        this.balance -= amount - (amount * 0.1);


    }

    public void deposit(double deposit) {
        this.balance += deposit;
        System.out.println("Deposit success");

    }
// toString --> inherited from Object

    @Override
    public String toString() {
        String result = "Name: " + this.name + "\nAcc.num: " + this.accountNumber + "\nBalance: " + this.balance;
        return result;

    }

}


//Create a class BankAccount  Public instance variables: balance, accountNumber, name  methods: 
//  info: This method shows the details of the BankAcount.
// Print balance, account number and name in this method implementation. 
//  transfer: This method accepts double and doesn’t return anything.
// Method should subtract the amount given and 10% of given amount as a transfer fee.   deposit: Method accept double and adds this amount to the balance.   
//Create a class CheckingAccount.   Extend this class to BankAccount.  
//  override the method transfer. Checking account’s transfer should be only 5% fee
// for transferring. Special case: Check if balance is enough. If not enough give
// proper message and don’t transfer. 
//Create a class SavingsAccount.  Add interestIncome instance variable.
//  Extend it to BankAccount.   Override the transfer here as well.
// SavingsAccount transfer should be 20% fee.  Override info method.
// Change the implementation and print all the info including
// interestIncome information as well.   Create additional method calculateAnnualInterestIncome. 3% of the current balance should go to interestIncome.  Override Object class’s toString method.
// Build a proper String with all instance variables and return the string. 
//