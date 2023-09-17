package exeptions;

public class ListItemNotFoundException extends RuntimeException {
    public ListItemNotFoundException(String message) {
        super(message);
    }
}
