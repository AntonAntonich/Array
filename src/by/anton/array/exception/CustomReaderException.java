package by.anton.array.exception;

public class CustomReaderException extends Exception{
    public CustomReaderException() {
    }

    public CustomReaderException(String message) {
        super(message);
    }

    public CustomReaderException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomReaderException(Throwable cause) {
        super(cause);
    }
}
