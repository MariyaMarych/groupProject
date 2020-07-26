package AbstractClassHome;

public class Apartment extends Home {




    @Override
    public void throwParty() {
        System.out.println("Throwing party at my apartment");
    }

    @Override
    public void lock() {
        System.out.println("The door is locked into my apartment");
    }

    @Override
    public void unlock() {
        System.out.println("The door is unlocked into my apartment");
    }

    @Override
    public void cook() {
        System.out.println("Someone is cooking at m y apartment");
    }
}
