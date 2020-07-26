package MethodOverriding;

public class BankingTest {
    public static void main(String[] args) {

        BankAccount ba = new BankAccount();
        ba.balance = 300;
        ba.name = "Jeniffer Lawrence";
        ba.accountNumber = 4566787;
        ba.info();
        System.out.println(ba.toString());
        ba.deposit(500);
        System.out.println(ba.toString());
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.info();
        savingsAccount.balance = 45645;
        savingsAccount.name = "zhanna";
        savingsAccount.calculateAnnualInterestIncome();
        savingsAccount.info();



    }
}
