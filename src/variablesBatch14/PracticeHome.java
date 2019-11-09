package variablesBatch14;

public class PracticeHome {
    public static void main(String[] args) {

        String command ="BUY";
        int balance = 550;
        int quantaty = 42;

        switch (command) {
            case "BUY":
                quantaty += 5;
                balance -= 20;
                break;
            case "SELL":
                quantaty -= 5;
                balance += 15;
        }
        System.out.println("Balance: $"+balance+System.lineSeparator()+"Quantaty: "+quantaty);


        System.out.println("I"+System.lineSeparator()+"a"+System.lineSeparator()+"boy");

        char keypressed = '@';

        System.out.println("\"Mariya Marych\" \n511 Rue Royale Dr.\nDeer Park\nIllinois\\60010\\\nUSA");

        }

    }



