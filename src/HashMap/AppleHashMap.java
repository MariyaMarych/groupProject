package HashMap;

import java.util.HashMap;
import java.util.Map;

public class AppleHashMap {
    public static void main(String[] args) {

        //   countWords("apple");
        String str = "apple";

      //      key value
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            String key = String.valueOf(str.charAt(i));
            if (!map.containsKey(key)) {
                map.put(key, 1);

            } else {
                map.put(key, map.get(key) + 1);

            }


        }
        System.out.println(map);

//    public static void countWords(String str) {
//
//
//        Map<Character, Integer> map = new HashMap<>();
//
//
//        for (Character key:map.keySet()) {
//            System.out.println("key"+ key);
//            System.out.println("value"+map.get(key));
//            System.out.println();
//        }
//
//
//    }


    }
}
