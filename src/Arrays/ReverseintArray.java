package Arrays;

import java.util.Arrays;

public class ReverseintArray {
    public static void main(String[] args) {


    int [] num = {1,4,7,9,5,5};
    int [] reversed  = new int [num.length];
int index = num.length-1;
int sum =0;
        for (int element:num) {
reversed[index]= element;
index--;
        }
        System.out.println(Arrays.toString(reversed));
        }

        }





