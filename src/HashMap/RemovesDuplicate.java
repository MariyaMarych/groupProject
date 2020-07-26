package HashMap;

import java.util.*;

public class RemovesDuplicate {


    public static void main(String[] args) {
        System.out.println(removesDuplicate("ABRACADABRA"));

        System.out.println(onlyUnique("ABCCHJJTTSS"));
    }

    public static String removesDuplicate(String str) {

        //removes duplicate automatically
        //lindhashset keeps the order, mained the order


        //   LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(arr));
        LinkedHashSet<String> set = new LinkedHashSet<>();

        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i) + "");


        }

        return set.toString().replace("[", "").replace("]", "").replace(",", "");


    }


    public static String onlyUnique(String str) {
        int count = 0;
        String uniq = "";

        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        for (String element : list) {
            count = Collections.frequency(list, element);
            if (count == 1) {
                uniq += element;
            }

        }


        return uniq;

    }


}
