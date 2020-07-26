package ABC;

public class Jet extends Plane implements Wifi, GoodFood{


    @Override
    public void takeOff() { //implements from Plane

    }

    @Override
    public void turnWifiOn() { // implements from Wifi

    }

    @Override
    public void getFood() {

    }

    @Override
    public boolean isEatable() {
        return false;
    }
}
