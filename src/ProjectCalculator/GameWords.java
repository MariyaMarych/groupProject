package ProjectCalculator;

import java.util.*;

public class GameWords {
    Timer timer;
    public GameWords(int seconds){
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds*1000);
    }
    class RemindTask extends TimerTask {
        public void run(){
            System.out.println("Time is up!");
            timer.cancel();
        }
    }
    public static void main(String[] args) {
        new GameWords(20);
        String [][] table = {
                {"L","A", "L","G","P","R","E","T","E","K","O","I","A","M"},
                {"P","M","L","E","O","P","I","G","L","A","W","E","H","A"},
                {"O","A","E","L","L","E","M","A","C","N","E","W","T","A"},
                {"D","T","L","L","I","T","E","T","G","G","A","P","A","E"},
                {"R","U","T","U","E","R","A","R","U","A","S","A","L","E"},
                {"A","R","E","I","M","P","O","A","H","R","E","R","T","E"},
                {"P","T","T","A","G","E","H","G","I","O","L","R","T","A"},
                {"O","L","G","W","R","I","A","A","E","O","E","O","E","T"},
                {"E","E","M","T","E","Z","R","K","N","L","E","T","L","R"},
                {"L","K","G","O","E","E","R","K","R","T","R","A","A","A"},
                {"R","A","T","L","I","A","H","O","R","S","E","A","H","A"},
                {"R","O","L","M","N","M","O","L","E","E","O","O","W","S"},
                {"T","E","N","S","E","E","T","I","M","R","E","T","M","H"},
                {"E","E","A","E","N","A","T","P","E","L","K","R","E","E"},
        };
        for (int i = 0; i < table.length; i++)
            System.out.println(Arrays.toString(table[i]));
        String [] arr = {"Elephant","Whale", "Camel", "Emu", "Gazelle", "Gorilla", "Horse", "Kangaroo", "Leopard", "Mole", "Parrot", "Turtle", "Weasel", "Termite", "Tiger", "Snake", "Rat", "Rhinoceros", "Pig" };
        Scanner in = new Scanner(System.in);
        String answer;
        int count =0;
        System.out.println("Game has started!!!");
        int animalCount=1;
        ArrayList<String> rightAnimals = new ArrayList<>();
        do {
            System.out.println("Please, enter your " + animalCount+ " animal: ");
            animalCount++;
            String word1 = in.nextLine();
            for(int i=0; i<arr.length; i++){
                if(word1.equalsIgnoreCase(arr[i])){
                    count++;
                    rightAnimals.add(arr[i]);
                }
            }
            System.out.println("Do you want to continue?");
            answer = in.nextLine().toLowerCase();
        }while (answer.contains("y"));
        System.out.println("You found " + count + " animals out of 19 animals.");
        System.out.println("Here is the list of your animals:" + rightAnimals);
    }
}



