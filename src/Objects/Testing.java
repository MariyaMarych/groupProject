package Objects;

public class Testing {
    public static void main(String[] args) {
        String name = "James";
        Flag f1 = new Flag(); //--> object from Flag
        f1.country = "USA";//-> WE HAVE TO ADD VALUE HERE IN OBJECTS
        f1.color = "RED/WHITE";
        f1.material = "wood";
        f1.upgrade(3,"ppp");
        System.out.println(f1.color);
        System.out.println(f1.material);
        f1.flap();
        Flag f2 = new Flag();// created new object
        System.out.println(f2.country);
        f2.material = "plastic";

        System.out.println(f2.material);
        f1.info();//obeject called method
        f2.info();// take object and call method

    }
}