import java.io.IOException;

public class 常见异常 {
    public static void main(String[] args) {
        //1.算数异常
        int a = 10;
        int b = 0;
        System.out.println(a/b);

        //2.数组下标越界
        int[] arr = new int[5];
        System.out.println(arr[5]);

        //3.空指针异常
        String s1=null;
        s1.length();

        //4.类型转换异常
        Exception exception = new Exception();
        IOException io=(IOException)exception;

        //5.数字格式异常
        String s2="asd123";
        System.out.println(Integer.parseInt(s2));




    }
}
