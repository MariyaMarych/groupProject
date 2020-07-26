package WensdayGurhanReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PilesOfBoxes {
    public static void main(String[] args) {
        List<Integer> boxpiles = new ArrayList<>();
        boxpiles.add(5);
        boxpiles.add(2);
        boxpiles.add(1);
        System.out.println(boxpiles.size()+" size");
        System.out.println(pileOfBox(boxpiles));
    }


    public static long pileOfBox(List<Integer> boxPiles) {


        Collections.sort(boxPiles);

        long steps = 0;
        for (int i = 0; i < boxPiles.size() - 1; i++) {
            if (boxPiles.get(i) < boxPiles.get(i+1)) { //5<2; 2<1;
                steps += boxPiles.size() - i - 1;
            }
        }
        return steps;
    }


// 5 2 1  125    -->21

    public static long pilesOfBoxes(int[] boxsesInPiles) {
        Arrays.sort(boxsesInPiles);
        long numberOfSteps = 0;
        do {
            for (int i = boxsesInPiles.length - 1; i > 0; i--) {
                if (boxsesInPiles[i] > boxsesInPiles[i - 1]) {
                    boxsesInPiles[i] = boxsesInPiles[i - 1];
                    numberOfSteps++;
                }
            }
        } while (boxsesInPiles[0] != boxsesInPiles[boxsesInPiles.length - 1]);
        return numberOfSteps;
    }
}
