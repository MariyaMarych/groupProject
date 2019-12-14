package MondayProjects;

public class CamelCase {
    public static void main(String[] args) {


        String in = "I love my husband";
        String[] arr = in.trim().split(" ");
        String camelCase = "";
        for (int i = 0; i < arr.length; i++) {
            camelCase += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase() + " ";

        }


        System.out.println(camelCase.trim());
    }
}