package Polymorphism3;

public class GermanShepard extends Dog implements Trainable{
int age;

    @Override
    public void bark() {

    }

    @Override
    public void breath() {
        System.out.println("GermanShepard is breathing");
    }
}
