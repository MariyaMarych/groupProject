package AbstractClassHome;

public class SingleHouse extends Home {

    String garagetype;


    public void cutGrass() {

    }


    public void showelSnow() {
    }


    @Override
    public void throwParty() {
        System.out.println("Throwing party at my house");
    }

    @Override
    public void lock() {
        System.out.println("Locking my house");
    }

    @Override
    public void unlock() {
        System.out.println("Unlocking my house");
    }

    @Override
    public void cook() {
        System.out.println("Someone is cooking at my house");
    }


    @Override
    public String toString() {
        String string = super.toString() + "\nGarage type: " + garagetype;
        return string;
    }
}
