package Methods;

public class MethodsTasks1 {
    public static void main(String[] args) {
   //Create a method that will accept two Strings. Return a new String that has the firstWord then the secondWord and then the firstWord again
        //> input: “day”, “name”
        //> output: “daynameday”
        //Overload the method above to now accept the two Strings and an integer. The integer given tells you how many times your first word should show up in your new String. Your first words need to always be separated by the second word.
        // > input: “day”, “name”, 3
        //> output: “daynamedaynameday”
   //

        System.out.println(accept2Strings("day","name"));

        System.out.println(accept2String("day","name",3));
    }



public static String accept2Strings (String name1,String name2 ){
        String name3 = name1+name2+name1;
        return name3;
}


public static String accept2String (String name1, String name2, int times){
        if (times <= 0 ){
            return "";
        }
        String str ="";
    for (int i = 0; i < times; i++) {

        str+=name1;
        str+=name2;
    }
    return str;
//return  str.substring(0,name2.length()- name2.length());

    // if (i == times -1 ){
    //break;
    //}

}
}
