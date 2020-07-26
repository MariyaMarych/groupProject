package Polymorphism2;

public abstract class Chair {
    String model;
    double weight;
    String color;

    public abstract void sit();
    public abstract void stepOnIt();

    public void chahgeColor(String color){
        this.color=color;

    }




}
