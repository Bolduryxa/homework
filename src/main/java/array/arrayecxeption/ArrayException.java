package array.arrayecxeption;

/**
 * Created  by bolduryxa on 24.03.16.
 */
public class ArrayException extends RuntimeException {
    public ArrayException (){
        super();
    }

    public ArrayException (String message){
        super( message);
    }

    public ArrayException (String message, Throwable cause){
        super( message, cause);
    }

    public ArrayException (Throwable cause){
        super( cause);
    }


}
