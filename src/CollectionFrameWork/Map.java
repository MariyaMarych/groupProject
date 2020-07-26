package CollectionFrameWork;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class MapTest {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "mariya");
        map.put(1, "Olya");
        map.put(2, "Oleg");
        map.put(4, "Oksana");
        map.put(5, "Pavlo");

     //   System.out.println(map);


        String word = "abrakadabra";
             //key /// value///
        Map<String, Integer> map1 = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            String elelement = String.valueOf(word.charAt(i));
            if (!map1.containsKey(elelement)) {
                map1.put(elelement, 1);
                continue;
            }
            else {                  //map.getKey --> will return VALUE +1 it will update
                map1.put(elelement,map1.get(elelement)+1);
            }
        }
        System.out.println(map1);

    }


}

