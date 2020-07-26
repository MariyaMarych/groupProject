package Polymorphism2;

public class Aeron extends Chair implements Rollable{
    @Override
    public void rollBack() {

    }

    @Override
    public void rollForward() {

    }

    @Override
    public void sit() {
        System.out.println("Sitiing on Aeron chair");
    }

    @Override
    public void stepOnIt() {
        System.out.println("Stepping on Aeron chair");
    }

}
