package exeptions;

public class ListIndexNotFoundException extends RuntimeException {
    public ListIndexNotFoundException(String message) {
        super(message);
    }
}
