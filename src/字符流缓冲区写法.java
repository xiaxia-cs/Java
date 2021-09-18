import java.io.*;

public class 字符流缓冲区写法 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader("./mytest.txt")
        );
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("./buffertest1.txt")
        );
        int len;
        char[] chars = new char[1024];
        while((len=bufferedReader.read(chars))!=-1){
            bufferedWriter.write(chars);
        }
        bufferedReader.close();
        bufferedWriter.close();


    }
}
