package Scanner;


import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first name 1");
        String firstName1 =input.nextLine().trim();
        System.out.println("enter last name 1");
        String lastName1 =input.nextLine();
        System.out.println("enter first name 2");
        String firstName2 =input.nextLine();
        System.out.println("enter last name 2");
        String lastName2 =input.nextLine();

        if(lastName1.equalsIgnoreCase(lastName2)){
            System.out.println("you are relatives");
        }else{
            System.out.println("you are not relatives");
        }

//     String lastName1= name1.substring(name1.indexOf(" "+1);
      //  String lastName1= name1.substring(name1.indexOf(" "+1);

    }
}
