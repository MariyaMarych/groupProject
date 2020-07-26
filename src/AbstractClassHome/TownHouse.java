package AbstractClassHome;

public class TownHouse  extends Home{

    public void shareWithTheNeigibor(){
        System.out.println("Sharing wiht the neighbors");
    }

    @Override
    public void throwParty() {
        System.out.println("Throwing party at my Townhouse");
    }

    @Override
    public void lock() {
        System.out.println("Locking my TownHouse");
    }

    @Override
    public void unlock() {
        System.out.println("Unlocking my TownHouse");
    }

    @Override
    public void cook() {
        System.out.println("Someone is cooing at my Townhouse");
    }
}
