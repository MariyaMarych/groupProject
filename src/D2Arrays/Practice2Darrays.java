package D2Arrays;

public class Practice2Darrays {
    public static void main(String[] args) {

        int [][] numbers = {
                {1,2,3},
                {4,5,6,5},
                {7,8,9}};

for (int [] inner: numbers){// every element is going to be called inner!

    for (int element : inner){
        System.out.println(element);//each element of our array is a number

    }
    System.out.println();


}



    }
}
