package CustomException;

public class InvalidOsException extends Exception {

    public InvalidOsException(){

    }

    public InvalidOsException(String message){
        super(message);
    }
}
