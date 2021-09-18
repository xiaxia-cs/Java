import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class 简化字符流写法 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("./mytest.txt");
        FileWriter fileWriter = new FileWriter("./newcopy.txt");

        char[] chars = new char[1024];int len;
        while((len=fileReader.read(chars))!=-1){
            fileWriter.write(chars,0,len);


        }
        fileReader.close();
        fileWriter.close();



    }
}
