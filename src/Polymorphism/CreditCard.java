package Polymorphism;

public class CreditCard extends PaymentMethod {


    @Override
    public void charge(double amount) {
        System.out.println("Amount is charged to the credit card "+amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Amount is refunded to credit card "+amount);
    }
}
