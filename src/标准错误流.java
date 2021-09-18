import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class 标准错误流 {
    public static void main(String[] args) throws IOException {
        //这两个输入的顺序不一定，没有固定的先后顺序
        System.out.println("这是标准输出流");
        System.err.println("这是标准错误流");
        System.err.println("这是标准错误流");

        //自己封装的标准错误流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.err));
        bw.write("自己包装的错误流输出");
        bw.close();




    }
}
