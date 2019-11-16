package D2Arrays;

import java.util.Arrays;

public class Intro2DArrays {

/*
ARRAYS ARE ONE TYPE OF COLLECTION.THEY STORE MULTIPLE INFO THE SAME KIND.
-->Arrays can store primitive data types and object types.
primitives: int arrays
object: String array
-->Recall: Arrays are also objects
> This means Arrays should be able to hold other array.
*What is multi dimensional array
>an array inside of an array;
Syntax for declaration:

data type[][] varName = new datatype [][];
aD arrays size can increase or decrease after declaring!!!!!!

itn [] [] = groups = new int [4] [];//second [] you can leave it blank;
--> groups is a 2d int array that can hold 4 int arrays inside of it.
The size of the inner int arrays is not declared.You can leave it blank
inner size don't need to be declare;

String by default will have --> null

--> After declaration this 2D array all the values will be null;
*Notes: When you declare 2 array , inner arrays sizes do not need to be given
> This means the inner arrays can be different number of elements;
--> How to print multi dimensional arrays
Arrays.deepToString();
----------------------------------------------------
Syntax for initializing:
int [][] numbers = {{1,2,3},{4,5,6},{7,8,9}}
> numbers is holding 3 int arrays each with 3 element;






 */

    public static void main(String[] args) {

        int [][] groups = new int [3][4];
        int [] num = {1,2,3};
        groups[0]= num;
        System.out.println(Arrays.deepToString(groups));

String [][] str = new String[4][4];
        System.out.println(Arrays.deepToString(str));

int [][] numbers = {
        {1,2,3},
        {4,5,6,5},
        {7,8,9}};
        System.out.println(Arrays.toString(numbers[0]));
        System.out.println(numbers[0][2]);
        System.out.println(numbers[2] [2]);
        System.out.println(Arrays.toString(numbers[0] )+" "+Arrays.toString(numbers[2]));
        System.out.println(numbers[1].length);
        System.out.println(numbers[0].length);

        for (int i = 0; i < numbers.length; i++) {//keeping track for each arrays


            for (int j = 0; j < numbers[i].length; j++) {//keeping track for elements in each array
                System.out.println(numbers[i][j]);

            }
            System.out.println();
        }

    }  }