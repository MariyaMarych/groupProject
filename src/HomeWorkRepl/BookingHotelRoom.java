package HomeWorkRepl;

public class BookingHotelRoom {
    public static void main(String[] args) {

        simpleRoomBook(true,5,6,2018);
        System.out.println(simpleRoomBook(false,7,1,2018));
        System.out.println(simpleRoomBook(true,4,5,2018));
        System.out.println(simpleRoomBook(true,3,2,2018));
        System.out.println(simpleRoomBook(true,5,3,2018));
        System.out.println(simpleRoomBook(false,7,4,2018));
    }


    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year)
    {
        if (month ==7 && ( day >= 1 || day <= 8) && year == 2018  ){
            return false;
        }else{
            return true;
        }
    }
}

