package CustomException;

public class Store {
    public static void main(String[] args) {


        Laptop laptop = new Laptop();
        try {
            laptop.setOs("macoos");
            laptop.turnOn();

        } catch (InvalidOsException | LaptopNotTurningOnException e) {
            e.printStackTrace();


        }
    }
}