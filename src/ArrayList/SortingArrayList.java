package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class SortingArrayList {
//41435678i9

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,1,4,5,6,5,9));
        System.out.println((sortingArrayListM(list)));


    }

    public static ArrayList<Integer> sortingArrayListM(ArrayList<Integer> arr) {

        for (int i = 0; i < arr.size(); i++) {

            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(i) < arr.get(j)) {
                    int temp = arr.get(i);//4
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }


            }


        }

        return arr;
    }
}
