package Arrays;

public class Task5 {
    public static void main(String[] args) {


        int[] numbers = {3, 30, 14, 6, 50, 20};
        int max= numbers[0];//choose 1st number =0

        for (int i = 1; i < numbers.length; i++){
        if(numbers[i]>max){
            max = numbers[i];//store and reassign if it's bigger, if not go check again

        }


    }
        System.out.println(max);
    }
}
