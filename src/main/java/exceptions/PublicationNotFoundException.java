package exceptions;

public class PublicationNotFoundException extends RuntimeException {
    public PublicationNotFoundException(String message){
        super(message);
    }
}
