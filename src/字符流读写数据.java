import java.io.*;

public class 字符流读写数据 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(
                new FileInputStream("./mytest.txt"),"GBK"
        );
        OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream("./copytest.txt"),"GBK"
        );


        int len;
        char[] chars = new char[1024];
        while ((len=isr.read(chars))!=-1){
            osw.write(chars,0,len);


        }
        isr.close();
        osw.close();



    }
}
