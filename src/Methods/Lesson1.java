package Methods;

public class Lesson1 {
    public static void main(String[] args) {
       sayHello();
       sayBye();
       sayHello();
    }

    public static void sayHello() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hi");
        }

    }

    public static void sayBye(){
        System.out.println("bye");

    }

}
