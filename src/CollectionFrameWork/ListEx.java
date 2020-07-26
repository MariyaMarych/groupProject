package CollectionFrameWork;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {

        List<String> cars = new ArrayList<>();
        cars.add("bmw");
        cars.add("lexus");
        cars.add("bmw");
        cars.add("Toyota");

        System.out.println(cars);
        System.out.println(cars.get(1));


    }
}
