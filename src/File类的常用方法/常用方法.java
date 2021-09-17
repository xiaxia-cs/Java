package File类的常用方法;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class 常用方法 {
    public static void main(String[] args) {
        File file = new File("./");
        File file1 = new File("./a.txt");
        File file2 = new File("./myDir");
        System.out.println(file.isDirectory());
        System.out.println(file1.isDirectory());
        System.out.println(file2.isDirectory());


        System.out.println(file.getPath());
        System.out.println(file1.getPath());
        System.out.println(file2.getPath());

        //list
        /***
         * 获取当前目录下的文件和目录
         */
        String[] list = file.list();
        for(String name:list){
            System.out.println(name);
        }
        //获取当前目录下所有文件和目录的File对象，以便之后的操作
        File[] files = file.listFiles();
        for (File fille:files){
            System.out.println(fille);
        }

        //获取最后的毫秒数
        System.out.println();
        Date date = new Date(file.lastModified());
        System.out.println(date);
        //记住这个格式化的格式
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");

        System.out.println(sdf.format(date));



    }
}
