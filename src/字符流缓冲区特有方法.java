import java.io.*;

public class 字符流缓冲区特有方法 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(
                new FileReader("./mytest.txt")
        );
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("./buffertest2.txt")
        );


        String line;
        while ((line=bufferedReader.readLine())!=null){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        bufferedReader.close();
        bufferedWriter.close();


    }





}
