package Arrays;

public class ForEachLoop {

    public static void main(String[] args) {
        /*
        can be used only for collection;
        it goes through each element in the collection;
        this loop is only READ only,
        ---->>>  SYNTAX :
        for (DataTypeOfElement nameOfElements : collectionName) {

        }
        ----- nameOfElements --> int num = numbers[i]

         */

        int[] numbers = {4, 32, 6, 1, 8};
        String[] names = {"adam", "james", "bob" };
        // traditional
        for (int i = 0; i < numbers.length; i++) {

            // for each
            for (String name : names) {// String NAME --- JUST TO NAME ARRAY
                if (name.contains("bill"))
                    System.out.println(name);
                for (int number : numbers) { // we declared all elements to int number from array numbers
                    if (number % 2 == 0) {
                        System.out.println(number); // will print all elelments from array numbers
                    }
                }
            }


        }

    }
}
