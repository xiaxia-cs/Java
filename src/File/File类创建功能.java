package File;

import java.io.File;
import java.io.IOException;

public class File类创建功能 {
    public static void main(String[] args) throws IOException {
        File file = new File("./mytest.txt");
        if(file.createNewFile()){
            System.out.println("文件创建成功");

        }else{
            System.out.println("文件创建失败");
        }

        //创建目录描述符
        File file1 = new File("./mydir");
        if(file1.mkdir()){
            System.out.println("目录创建成功");
        }else{
            System.out.println("目录创建失败");
        }


        //创建多级文件目录

        File file2 = new File("H/E/L/L/O");
        if (file2.mkdirs()){
            System.out.println("创建多级目录成功");
        }else{
            System.out.println("创建多级目录失败");
        }


    }

}
