package Methods;

public class Lesson2 {
    public static void main(String[] args) {
        printHello();
        oddNumbers();
    }

    public static void printHello() {
        for (int i = 0; i < 50; i++) {
            System.out.print("Say Hello ");
        }

    }


    public static void oddNumbers() {

        for (int i = 1; i < 100; i += 2) {
            System.out.println(i + ", ");
        }

    }


}
