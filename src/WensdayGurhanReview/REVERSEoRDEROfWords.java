package WensdayGurhanReview;

public class REVERSEoRDEROfWords {
    public static void main(String[] args) {

        String str = "I love Java";
        String name = "";
        String[] arr = str.split(" ");
        for (int i = str.length() - 1; i >= 0; i--) {

            name += str.charAt(i) + " ";

        }

        System.out.println(name);


        String str1 = "I love Java very much";
        String reverse = "";
        String[] arr1 = str1.split(" ");


        for (int i = arr1.length - 1; i >= 0; i--) {
            reverse += arr1[i] + " ";

        }
        System.out.println(reverse);
        System.out.println(reverse.substring(0, reverse.length() - 1));

String numberWord = "344566";

int number = Integer.valueOf(numberWord);
        System.out.println(number);

double number5 = Double.valueOf(numberWord);
        System.out.println(number5);
    }





        }




