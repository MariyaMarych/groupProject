package HomeWorkRepl;

public class FindWord {
    public static void main(String[] args) {

String [] arr = {"go","ko","po","go","go"};
        System.out.println(count_appearance(arr,"go"));
    }

    public static int  count_appearance(String [] arr, String t )
    {
        int count = 0;
        for (String element: arr){
            if (element == t){
                count++;
                if (count >1){
                }
            }

        }
        return count;

    } //end  count_appearance


}












//Create a method that gets an array of strings and a string, the method returns an int.
//
//It counts how many times a string appears in the array and returns the count.
//
//for example (pseudo code):
//
//some_array = ["a","foo","bar","foo","bla"]
//
//some_string = "foo"
//
//count_appearance(some_array ,some_string )
//
//will return 2 because some_array  has 2 appearances of "foo" string.
//