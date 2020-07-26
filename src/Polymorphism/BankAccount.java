package Polymorphism;

public class BankAccount extends PaymentMethod {

    @Override
    public void charge(double amount){
        System.out.println("Amount charging in Bank Account "+ amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Amount is refunded to bank account "+amount);
    }
}
