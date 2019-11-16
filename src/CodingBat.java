public class CodingBat {
    public static void main(String[] args) {
        System.out.println(lastChars("java",""));
    }
    public static String lastChars(String a, String b) {
if(a.isEmpty()){
    return "@"+b.substring(b.length()-1);
}
if(b.isEmpty()){
    return a.substring(0,1)+"@";
}
        String firstChar = a.substring(0,1);
        String lastChar = b.substring(b.length()-1);

        return firstChar+lastChar;
    }

}
