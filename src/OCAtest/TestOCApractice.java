package OCAtest;

public class TestOCApractice {
    public static void main(String[] args) {


        String ta = "A ";
        ta = ta.concat("B ");
        String tb ="C ";
        ta=ta.concat(tb);
        ta.replace('C','D');
        ta= ta.concat(tb);
        System.out.println(ta);
// OPT2
        String n = "HELLO WORLD";
        n.trim();
        int v =n.indexOf(" ");
        System.out.println(v);




    }




}
