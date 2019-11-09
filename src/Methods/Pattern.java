package Methods;

public class Pattern {
    public static void main(String[] args) {
printHollowRect();
    }

    public static void printHollowRect()
    {
        for(int i = 0; i < 2; i++) {
            System.out.println("*****");
            if( i == 1) break;
            for(int j = 0; j < 3; j++) {
                System.out.println("* * *");
                System.out.println("!!!!");
            }
        }
    }
}









///Create a method printHollowRect that prints a 5 on 5 hollow rectangle:
//
//
//*****
//*   *
//*   *
//*   *
//*****
//
//hint:you will need to use two nested for loops for that, and an if that checks
// if its the
// last or first iteration of the loop (so you will know whet
// to print "*" or " ")