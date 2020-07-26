package Exception;

public class ExceptionIntro {

    public static void main(String[] args) {
        try {
            String a = "hello";
            System.out.println(a.charAt(30)); // --> unchecked Exception
            //Thread.sleep(3000);
            System.out.println(3/0);
            System.out.println(new int [] {3,5,6} [5]);
//Dog.bark();

        }
        catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Index doesn not exist");
            System.out.println(e.toString());
        }
        catch (ArithmeticException e){
            System.out.println("You can't divide on zero");
            System.out.println(e.toString());
        }
catch (Exception e ){

    System.out.println("Unknown Exception");
    System.out.println(e.toString());
}

        try{
            Thread.sleep(1000);
            Dog d = null;
            int a = d.age;
        }catch (InterruptedException e){

        }

        System.out.println("The end");
    }
}
