package 自定义异常类;

public class NameException extends Exception {
    public NameException() {
    }

    public NameException(String message) {
        super(message);
    }
}
