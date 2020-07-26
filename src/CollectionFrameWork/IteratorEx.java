package CollectionFrameWork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorEx {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("James");
        names.add("Joe");
        names.add("Sara");
        names.add("Ben");
        names.add("Adam");
        Iterator<String> it = names.iterator(); // to
//        it.next(); // moved to james
//        it.next(); // points to sara

        while (it.hasNext()){ //BOOLEAN -->check if you cam move!! checking if there is another element to move to, if yes , then -->true.if not -->false!
            String name = it.next();// takes a pin moving to next element and stores into a String;
            System.out.println(name);


            if(name.equals("Ben")){
                it.remove();
            }
        }

        System.out.println(names);

    }

}
