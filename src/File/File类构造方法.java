package File;

import java.io.File;

public class File类构造方法 {
    public static void main(String[] args) {
        //file对象可以理解成文件描述符，或文件句柄
        //  ./  ：表示当前路径
        File file01 = new File("./myTest.txt");
        System.out.println(file01);

        File file02 = new File("./", "myTest02");
        System.out.println(file02);

        File file03 = new File("./");
        File myTest03 = new File(file03,"myTest03");
        System.out.println(myTest03);



    }
}
