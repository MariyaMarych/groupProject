package Mentorings.Tuesday;

public class CodingBatExamples {
    public static void main(String[] args) {
        String name = "Dmytro";
        System.out.println("Please enter your name!");
        helloName(name);
        makeAbba("Hi", "Bye");
    }
    // Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
    public static String helloName(String name) { //String name is parameters;
        String hello = "Hello ";
        String result = hello + name + "!";
        System.out.println(result);
        return result;
    }
    // Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
    public static String makeAbba(String a, String b) {
        String result = a + b + b + a;
        return result;
    }
    /*The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
    In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
    Given tag and word strings, create the javax.swing.text.html.HTML string with tags around the word, e.g. "<i>Yay</i>".
     */
    public static String makeTags(String tag, String word) {
        //   String result = "<" + tag + ">" + word + "</" + tag + ">";
        String result = String.format("<%s>%s</%s>", tag, word, tag);
        result.replaceAll("<i>","");
        System.out.println(result);
        return result;
    }
}

