package exceptions;

public class StaffCouldNotBeFiredException extends RuntimeException{
    String message = "";

    public StaffCouldNotBeFiredException (String message){
        this.message = message;
    }
}
