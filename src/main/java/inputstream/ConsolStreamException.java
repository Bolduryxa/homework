package inputstream;

/**
 * Created  by bolduryxa on 25.03.16.
 */
public class ConsolStreamException extends RuntimeException {


    /**
     * Constructs a new runtime exception with the specified detail message and cause.
     *
     * @param message 'message' - the detail message. The detail message is saved for later retrieval by the Throwable.getMessage() method.
     * @param cause   'cause' - the cause (which is saved for later retrieval by the Throwable.getCause() method).
     */
    public ConsolStreamException(final String message, final Throwable cause) {
        super(message, cause);
    }
}

