package D2Arrays;

import java.util.Arrays;

public class TaskArrays {
    public static void main(String[] args) {
        int [][] arrs = {{1,2,3},{4,6,78,8},{6,8,9}};


        int lenght1 = arrs[0].length;
        int length2 = arrs[1].length;
        int length3 =arrs[2].length;
        System.out.println("Length of row 1:"+lenght1);
        System.out.println("Length of row 2:"+length2);
        System.out.println("Length of row 3:"+length3);




        String [][] group = new String[3][];

        String [] name1 = {"Anton","Mariya"};
        String [] name2 = {"MMMM","Mila"};
        String [] name3 = {"Olya","Vlad"};

        group [0] =name1;
        group[1] =name2;
        group[2] =name3;
        System.out.println(Arrays.deepToString(group));





    }


}
//Create a 2D String array that will hold 3 groups.
// Create three 1D arrays and initialize them with some group members names.
// Store each 1D array into your 2D and print the 2D array at the end