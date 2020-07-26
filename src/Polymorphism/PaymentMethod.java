package Polymorphism;

public class PaymentMethod implements MobileVerifiable {

    public void charge (double amount){
        System.out.println("Amount charged: "+amount);
    }

    public void  refund(double amount){
        System.out.println("Amount refunded: "+amount);

    }

    @Override
    public boolean verify() {
        System.out.println("Message please approve ");
        return true;
    }
}
