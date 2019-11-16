package HomeWorkRepl;

public class Arrays {
    public static void main(String[] args) {
        int [] arr ={2,9,3,6,1};
        int [] arr1 ={1,2,3,2,1};

        System.out.println(java.util.Arrays.toString(addElements((arr), (arr1))));
    }

    public static int[] addElements(int[] ints1, int [] ints2) {
        int[] arr = new int[5];
        arr[0] = ints1[0] + ints2[0];
        arr[1] = ints1[1] + ints2[1];
        arr[2] = ints1[2] + ints2[2];
        arr[3] = ints1[3] + ints2[3];
        arr[4] = ints1[4] + ints2[4];


return arr;
    }

   }
//}







