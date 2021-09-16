package 自定义异常类;

/**
 * 年龄异常类
 */
public class AgeException extends Exception {
    public AgeException() {
    }

    public AgeException(String message) {
        super(message);
    }
}
