package Methods;

public class ReturnsTasks {
    public static void main(String[] args) {
        System.out.println(revString("mother"));

        System.out.println(palindrome("civic"));
        System.out.println(palindrome("122344"));
    }

    public static String revString(String name) {
        String reversed = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reversed += name.charAt(i);
        }
        return reversed;

    }

    public static boolean palindrome(String name) {
        String newName = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            newName += name.charAt(i);
        }
        if (name.equalsIgnoreCase(newName)) {
            return true;
        }
        return false;

    }

    public static boolean isPalindromeArr(String str) {
        char[] arr = str.toLowerCase().toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }

        }
        return true;


    }
}