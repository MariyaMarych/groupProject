package Loops;

public class Rectangle {
    public static void main(String[] args) {


        for (int i = 1; i < 6; i++) {// i =  we will get first row
            for (int j = 1; j < 6; j++) {
                if ((i == 2 && j > 1 && j < 5) || (i == 3 && j > 1 && j < 5) || (i == 4 && j > 1 && j < 5)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}