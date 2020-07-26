package Exception;

public class FinalTask {

    public static void main(String[] args) {
String s = "cybertek";
        try{

            System.out.println(s.substring(3));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Inde3x doesn't exist");
        }finally {
            System.out.println("The string was "+s);
            throw new RuntimeException();
        }


    }
}
