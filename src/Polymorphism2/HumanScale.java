package Polymorphism2;

public class HumanScale extends Chair implements Rollable,Collapsible {
    @Override
    public void lock() {
        System.out.println("Human scale is locking");
    }

    @Override
    public void unlock() {
        System.out.println("Human scale is unclocking");
    }

    @Override
    public void fold() {
        System.out.println("Human scqale is folding");
    }

    @Override
    public void unfold() {
        System.out.println("Human scale is unfoldable");
    }

    @Override
    public void rollBack() {
        System.out.println("HumanScale is rollingback");
    }

    @Override
    public void rollForward() {
        System.out.println("Humanscale is rollingfarding");
    }

    @Override
    public void sit() {
        System.out.println("sittin on HumanScale chair");
    }

    @Override
    public void stepOnIt() {
        System.out.println("stepping on HumanScale chair");
    }
}
