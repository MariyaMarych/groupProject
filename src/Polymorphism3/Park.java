package Polymorphism3;

public class Park {
    public static void main(String[] args) {

        Dog dog = new GermanShepard();
        dog.breath();

        String s = dog.type;

        Trainable dog2 = new GermanShepard();
        GermanShepard dog5 = new GermanShepard();
        dog2.bark();
        String name = dog2.name;



    }
}
