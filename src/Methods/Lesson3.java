package Methods;

public class Lesson3 {
    public static void main(String[] args) {
        Lesson2.printHello();
        Lesson2.oddNumbers();
        printName("James");
        printName("Adam");
        firstChar("Dimka wpilka");
        goTo("London","Ukraine");
        makeEmail("Mariya","Marych",16);

    }

    public static void printName(String name){
        System.out.println(name);


    }

    public static void firstChar(String name){
        System.out.println(name.charAt(0));

    }
    public static void goTo(String origin, String newLocation){
        System.out.println("You start from" + origin);
        System.out.println("And you are goin to " +newLocation);

    }

    public static void makeEmail(String firstName,String lastName, int age){
        String email = firstName.toLowerCase()+age+lastName.toLowerCase()+"@cybertek.com";
        System.out.println(email);

    }
}
