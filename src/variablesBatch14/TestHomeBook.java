package variablesBatch14;

public class TestHomeBook {
    public static void main(String[] args) {
        String s = "Text \\processing is hard";

        int position = s.indexOf("hard");// text processing is hard-->19
        s =s.substring(0,position)+ "easy!";
        s= s.toUpperCase();//all in upper case
        System.out.println(s);



    }
}
