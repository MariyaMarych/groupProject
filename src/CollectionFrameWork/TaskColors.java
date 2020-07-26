package CollectionFrameWork;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TaskColors {

//
//    Create two Sets of Colors:
//    Set 1 : "red","green","black","white"
//    Set 2 : "red","yellow","white","pink"
//    Go through both sets and return a String of all the colors which both Sets have
//


    public static void main(String[] args) {


        Set<String> colors1 = new HashSet<>();
        Set<String> colors2 = new HashSet<>();

        Collections.addAll(colors1,"red","green","black","white");


        colors2.add("red");
        colors2.add("yellow");
        colors2.add("white");
        colors2.add("pink");

        String str ="";
        for (String element1:colors1) {
            for (String element2:colors2) {

                if(element1.equals(element2)){
                    str+=element1+" ";
                }


            }

        }

        System.out.println(str);

    }
}
