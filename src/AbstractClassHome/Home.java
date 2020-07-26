package AbstractClassHome;

public abstract class Home {
    int numberOfRomms;
    String addresses;
    int maxNumberOfGuests;


    public  abstract void throwParty();

    public abstract void lock();

    public abstract void unlock();

    public abstract void cook();


    @Override
    public String toString() {
        String str = "Home info " +
                "numberOfRomms=" + numberOfRomms +
                ", addresses='" + addresses + '\'' +
                ", maxNumberOfRooms=" + maxNumberOfGuests ;
        return str;
    }


}






//Abstract class Home.
//Instance variables: numOfRooms, address, maxNumOfGuests;
//
//Methods: throwParty, lock, unlock, cook.
//
//Override toString method. Build and return all info about Home.   
//
//Concrete classes: Apartment, Townhouse, SingleHouse.
//Townhouse additional methods: shareWithNeighbor.
//SingleHouse additional methods: cutGrass, shovelSnow.
//SingleHouse additional variable: garageType.
//Override toString method and include garageType info.
//
//
//