package web.exception;

public class AccessErrorException extends RuntimeException {
    public AccessErrorException(String message) {
        super(message);
    }
}