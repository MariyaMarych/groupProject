package HomeWorkRepl;

public class PalindromeString {
    public static void main(String[] args) {
        char [] c = new char [100];
        c = new char []{'h','c', 'l', 'k'};



        String s = new String(c);
        long start =System.currentTimeMillis();
        System.out.println(isPalindromeStringBuilder(s));
        System.out.println(isPalindrome("civic"));
        System.out.println(iSPalindromeBetterOne(s));

        long end = System.currentTimeMillis();
        System.out.println(end - start);

        System.out.println(iSPalindromeBetterOne(s));
        System.out.println(iSPalindromeBetterOne(null));


    }

    static boolean isPalindrome(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return s.equals(reversed);
    }

    static boolean iSPalindromeBetterOne (String  s){
        if (s == null || s.isEmpty()) return false;
        s= s.toLowerCase().trim().replace("","");
        boolean isPalindrome = true;
        for (int i = 0 ; i < s.length()/2; i++) {
            if (s.charAt(i)!= s.charAt(s.length()-1 - i)){//the last index will decrement -i!!-0;-1;-2 will go to the middle ome;
                isPalindrome = false;
                break;
            }
        }
        return  isPalindrome;
    }


    static boolean isPalindromeStringBuilder (String s){
       StringBuilder sB = new StringBuilder(s);
       String reversed = sB.reverse().toString();


        return s.equals(reversed);
    }




}

