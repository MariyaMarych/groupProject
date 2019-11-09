package Methods;

public class OverloadingMethods {
    public static void main(String[] args) {
jump("nike");
jump("adidas");
jump(5);
String[] arr = {"d"};
        System.out.println(jump(arr));
        int a = 45;
        int b = 5;
        calc(a);
        calc(a);
        calc(a);
        calc(a);
        calc(b);

    }
    public static void  jump (){
        System.out.println("You don't get far");
    }
    public static  void jump (String shoes){
        System.out.println("The shoes made you go farther");
    }
    public  static void jump (int distance){
        System.out.println("You jumped "+ distance);
    }
    public static String jump (String [] arr){
        return "jumped by array";
    }
    public static void calc (double d){
        System.out.println("using double");
    }
    public static  void calc (long f){
        System.out.println("using long");
    }
    public static void calc (int i){
        System.out.println("using int");
    }
}
