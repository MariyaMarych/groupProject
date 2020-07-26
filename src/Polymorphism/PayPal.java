package Polymorphism;

public class PayPal extends PaymentMethod {


    @Override
    public void charge(double amount) {
        System.out.println("Amount charged to PayPal account: "+ amount);
        System.out.println("Fee applied in PayPal: $3");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Amount refunded to PayPal account "+amount);
    }
}
