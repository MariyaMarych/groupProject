package variablesBatch14;

public class Datatypes {
    public static void main(String[] args) {

        int wild = 20;
        int pets = 0;

        System.out.println("wild: " + wild);
        System.out.println("pets: " + pets);
        System.out.println();

        wild -= 5;
        pets += 5;

        System.out.println("wild: " + wild);
        System.out.println("pets: " + pets);
        System.out.println();

        wild -= 10;
        pets += 10;


        System.out.println("wild: " + wild);
        System.out.println("pets: " + pets);
        System.out.println();

        double v = 5.5;
        int x = 3;
        int result = ++x * 10;
        System.out.println(result);

        int resultD = x++ * 10;
        System.out.println(resultD);

        char letter = 'a';
                String mmm = "I'm at home";
        System.out.println(mmm);
        int rate = 5;
        System.out.println(mmm + " "+ rate);
        String world1  = "Hello";
        String word2 = "World";
        System.out.println(world1 + " "+ word2);

String wordOne = "Hello";
wordOne = wordOne + " World";
        System.out.println(word2);

        String firstName = "Adam";
        System.out.println("My name is " +firstName);

        int numberOfStudents = 100;
        byte byteNumber = (byte)numberOfStudents;
        double height = 6.5;
        int intHeight = (int)height;
        System.out.println("Int Height " + intHeight);
        double secondDouble = intHeight;
        System.out.println("Int Height " + intHeight);

        String firstNamem = "Mariya";
        String lastName = "Marych";
        String email ="mariyamarych@gmail.com";
        System.out.println("First name :" + firstName);
        System.out.println("Last name :" + lastName);
        System.out.println();

        short chairs = 5;
        long newChairs = chairs;
        int lessChairs = (int) newChairs;
        System.out.println(newChairs);
        System.out.println((double) lessChairs);

        int a = 5;
        int b =2;
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(a%2);
        System.out.println(b%2);
        System.out.println(4%2);
        System.out.println(7%2);
        System.out.println(10%2);

        int sum = a + b;
        int min = a - b;
        a = a - 1;
        b = b / 2;
        System.out.println(a);































    }
}
