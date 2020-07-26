package ArrayList;

import java.util.ArrayList;

public class RefuelTimes {
    public static int refuel_times(ArrayList<Integer> deliveries, int max_fuel) {
        int countStops = 0;
        int sum = 0;
        for (int i = 0; i < deliveries.size(); i++) {
            sum += deliveries.get(i);


        }


        if (sum % max_fuel == 0) {

            return countStops = sum / max_fuel;
        } else if (sum % max_fuel != 0) {
            return countStops = (sum / max_fuel) + 1;

        }

        //        return countStops = (sum /max_fuel)+(max_fuel/max_fuel);

//return countStops;
        return countStops;
    }




        public static void main (String[]args){

            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(9);
            arr.add(1);


            int times = refuel_times(arr, 3);
            System.out.print(times);//should output 5


        }
    }