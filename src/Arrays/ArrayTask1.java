package Arrays;

public class ArrayTask1 {
    public static void main(String[] args) {
        //  9) Given a String of: "knife", "wooden spoons", "plates", "cups", "forks", "pan", "pot", "trash can”, “fridge”, “dish washer”
        //Go through the array and print the value if there is multiple words.

        String[] word = {"knife", "wooden spoons", "plates", "cups", "forks", "pan" };
        for (int i = 0; i < word.length; i++) {
            if (word[i].trim().contains(" ")) {
                System.out.println(word[i]);
            }


        }
    }
}