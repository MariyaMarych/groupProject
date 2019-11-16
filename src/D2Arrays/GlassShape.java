package D2Arrays;

public class GlassShape {
    public static void main(String[] args) {

    }

    public static int HighestSum(int[][] arr) {

        int highestSum = 0;
        int sum = 0;
        for (int i = 0; i < arr.length - 2; i++) {

            for (int j = 0; j < arr[i].length - 2; j++) {
                int temp = 0;
                temp = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                temp += arr[i + 1][j + 1];
                temp += arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                if (temp > sum) {
                    sum = temp;
                }
            }
        }
        return sum;
    }

}







  //  Create a method that will sum the values from a 2D array in an hour
//  glass shape.
//  Return the highest sum.