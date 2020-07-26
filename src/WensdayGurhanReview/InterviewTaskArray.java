package WensdayGurhanReview;

import java.util.ArrayList;

public class InterviewTaskArray {


    public static ArrayList<Integer> removeArrayList(ArrayList<Integer> numbers) {

        ArrayList<Integer> unique = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (!unique.contains(numbers.get(i))) {
                unique.add(numbers.get(i));
            }


        }
return unique;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(7);
        nums.add(9);
        nums.add(17);
        nums.add(3);

        System.out.println(removeArrayList(nums));
    }
}