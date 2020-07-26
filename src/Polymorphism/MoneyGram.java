package Polymorphism;

public class MoneyGram implements MobileVerifiable{

    @Override
    public boolean verify() {
        System.out.println("moneygram verifying");
        return true;
    }
}
