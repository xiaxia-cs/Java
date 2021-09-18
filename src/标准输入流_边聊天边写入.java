import java.io.*;

public class 标准输入流_边聊天边写入 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("./testt.txt")));


       String str;
        while (true){

            if((str=br.readLine()).equals("over")){
                System.out.println("聊天结束");
                break;

            }
            bw.write(str);
            bw.newLine();
            bw.flush();
        }


        bw.close();
        br.close();



    }
}
