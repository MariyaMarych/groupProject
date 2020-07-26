package String;

public class CharIsDigit {
    public static void main(String[] args) {

String str = "Ma5riya4";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.valueOf(str.charAt(i) + "");
            }

        }

        System.out.println(sum);
        String m = " Mariya4ty56iy8";
        int sum1 = 0;
        for (int i = 0; i < m.length(); i++) {
            if(Character.isDigit(m.charAt(i))) // return true or false
            sum1+=Integer.valueOf(m.charAt(i));
// sum1 =+ Integer.parseInt(str.chartAt(i)))
            // str to int -->
        }
        System.out.println(sum1);
    }
}



