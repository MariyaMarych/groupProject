package Arrays;

public class Cities {
    public static void main(String[] args) {

   String [] cities = {"Chicago","New York","Madison","Miami","Washington"};
   int count =0;
   //boolean check= false //
   for (String city: cities) {
       if (city.equalsIgnoreCase("Chicago")) {
           System.out.println("Windy city found");
           count++;
       }
   }
       if (count>0){
           System.out.println("Windy city found "+ count+ " times");
       }else if (count == 0){
           System.out.println("Windy city not found");
       }
       System.out.println(count);
       }
   }



