package MethodOverriding;

public class SavingsAccount extends BankAccount {
    public double interestIncome;

    @Override
    public void transfer(double amount) {
        this.balance -= amount;
        this.balance -= (amount * 0.20);
    }


    @Override
    public void info() {
        super.info();
        System.out.println("Interest Income " + this.interestIncome);


    }

    public void calculateAnnualInterestIncome() {

        interestIncome =balance+ this.balance * 0.03;


    }

}