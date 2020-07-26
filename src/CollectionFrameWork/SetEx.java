package CollectionFrameWork;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
       // no indexes
        // Set
        Set<String> cars = new HashSet<>();
        cars.add("bmw");
        cars.add("lexus");
        cars.add("bmw");
        cars.add("Toyota");


        System.out.println(cars);

cars.add("Audi");
        System.out.println(cars);


//        List <String> list =  new ArrayList<>(cars);
//        System.out.println(list);

        for (String car: cars) {

            System.out.println(car);
        }




        int [] arr = {1,3,4,5,4,5,6,7,8,9};

        Set<Integer> a = new HashSet<>();

        Collections.addAll(a,2,3,55,3,2,5,6,7,8,9);

        for (Integer element: arr) {
            a.add(element);
        }

        System.out.println(a);


    }

}
