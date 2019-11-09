package Methods;

public class MethodsTasks {
    public static void main(String[] args) {

        int a = takeStrIndex("hello",0,3);
        System.out.println(a);



    }

    public static void firstChar (String name){
        System.out.println(name.charAt(0));
        }


    public static void takeStrIndex (String name, int index){
        System.out.println(name.charAt(index));

        }
     public static int takeStrIndex (String str, int indexOne, int indexTwo) {

        return str.substring(indexOne,indexTwo).length();
     }



    }


