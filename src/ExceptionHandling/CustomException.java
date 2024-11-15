package ExceptionHandling;

public class CustomException extends Exception {
    public char[] getMessage;

    public CustomException(String Message) {
        super(Message);
    }

}
