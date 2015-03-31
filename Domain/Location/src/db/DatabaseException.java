package db;

public class DatabaseException extends RuntimeException {
    
    public DatabaseException() {
        super();
    }
    
    public DatabaseException(String message) {
        super(message);
    }
    
    public DatabaseException(String message, Exception exc) {
        super(message, exc);
    }
    
}
