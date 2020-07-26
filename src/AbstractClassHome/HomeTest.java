package AbstractClassHome;

public class HomeTest {
    public static void main(String[] args) {

        SingleHouse singleHouse = new SingleHouse();
        singleHouse.garagetype = "Triple car";
        singleHouse.numberOfRomms = 6;
        singleHouse.maxNumberOfGuests =5;
        singleHouse.addresses = "511 Rue Royale dr.Deer park, Il, 60010";
        System.out.println(singleHouse.toString());
singleHouse.throwParty();
singleHouse.showelSnow();




    }
}
