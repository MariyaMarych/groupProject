package D2Arrays;

public class BiggestnUMBER {

    public static void main(String[] args) {

int [][] numbers ={{3,5,2,342,4,23},{43,32,4032,32,43},{43,43,23,23}};
        biggestNumber(numbers);
        System.out.println(biggestNumber(numbers));
        System.out.println(biggestsum(numbers));
    }

    public static int biggestNumber (int [][] numbers){

        int maxNumber= numbers[0][0];
        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j <numbers[i].length ; j++) {
                if(numbers[i][j] > maxNumber){
                    maxNumber= numbers[i][j];
                }

                }

            }
            return maxNumber;


        }
        public static int biggestsum (int [][] numbers){

        int index=0;
        int max=0;

            for (int i = 0; i < numbers.length; i++) {
                 int sum =0;
                for (int j= 0; j < numbers[i].length; j++) {//check all of the column and add together

                    sum += numbers[i][j];


                }
                if (sum>max){
                    index=i;


                }
            }
        return max;
        }

    }

//{{3,5,2,342,4,23},{43,32,4032,32,43},{43,43,23,23}}
//——————
//Create a method that will return the biggest numbers from a 2D array