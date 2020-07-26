package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PracticeHashMap {

    public static void main(String[] args) {

        Map <String , Integer > gradeScale = new HashMap<>();

        gradeScale.put("A",90);

        gradeScale.put("B",80);

        gradeScale.put("C",76);

        gradeScale.put("D",60);

        gradeScale.put("F",50);
// REASSIGNING THE VALUE FROM 50 TO 30 , PUT --> REASSIGN
        gradeScale.put("F",30);
// THE KEYS MUST BE UNIQUE, VALUE CAN BE DIFFERENT
        gradeScale.remove("F");
// REMOVE ONLY BY KEYS

        System.out.println(gradeScale.get("B")); // to get value get(key)
        System.out.println(gradeScale.get("F"));
        System.out.println(gradeScale.get("G"));// THE KEY DOESN'T EXIST --> NULL
        System.out.println(gradeScale);

        System.out.println(gradeScale.containsKey("A"));
        System.out.println(gradeScale.containsKey("G"));

        System.out.println(gradeScale.containsValue(80));
        System.out.println(gradeScale.containsValue(20));

        Set<String> keys =  gradeScale.keySet();
        System.out.println(keys);



        for (String element:gradeScale.keySet()) { //iterating through set Of keys using map
// make sure the size is not changed
            if(element.equals("C")) gradeScale.put(element,70);
            System.out.println(element+" "+gradeScale.get(element));
        }




    }
}
