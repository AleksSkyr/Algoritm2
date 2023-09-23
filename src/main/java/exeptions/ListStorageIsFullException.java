package exeptions;

public class ListStorageIsFullException extends RuntimeException{
    public ListStorageIsFullException(String message) {
        super(message);
    }
}
