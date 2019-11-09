package Methods;

public class ReturnNumbersSeconds {
    public static void main(String[] args) {








    }

    public static double getSeconds(String str) {
        String[] arr = str.split(" ");
        String strNoComma = arr[3].replace("(", "").replace(",","");
        double result = Double.valueOf(strNoComma);
        return result;
    }
    public static int getNumberResult(String str) {
        String[] arr = str.split(" ");
        String strNoComma = arr[1].replace(",", "");
        int result = Integer.valueOf(strNoComma);
        return result;
    }
}




