package Polymorphism;

public class ZelleTransfer implements MobileVerifiable {
    @Override
    public boolean verify() {
        System.out.println("Zeller is verifiing the transfer ");
        return true;
    }
}
