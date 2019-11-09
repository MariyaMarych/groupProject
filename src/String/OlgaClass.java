package String;

public class OlgaClass {
    public static void main(String[] args) {
        String str = "Niagara, o roar again!";

      int index_of_first_a = str.indexOf("a") ;
      int index_of_first_ga= str.indexOf("ga");
      int index_of_first_roar= str.indexOf("roar");

        System.out.println(index_of_first_a);
        System.out.println(index_of_first_ga);
        System.out.println(index_of_first_roar);


      int index_Of_second_a= str.indexOf("a",index_of_first_a+1);

        System.out.println("position of second a " + index_Of_second_a);

        int index_Of_third_a = str.indexOf("a",index_Of_second_a+1);
        System.out.println("position of third  a " + index_Of_third_a);

        int indexOfFourth_a = str.indexOf("a",index_Of_third_a+1);
        System.out.println("position of 4th A " +indexOfFourth_a);



        int lastIndexOf_r= str.lastIndexOf("r");
        System.out.println("last index of r "+ lastIndexOf_r);

        int lastIndexOf_second_from_the_end = str.lastIndexOf("r",lastIndexOf_r-1);
        System.out.println(lastIndexOf_second_from_the_end);

        int lengthOfString = str.length();
        System.out.println(lengthOfString);


    }
}
