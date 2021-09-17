## 1 - File类

### 1.1 - 基本概念

java.io.File类用于描述文件和目录的路径信息，可以获取文件的大小等属性信息。

### 1.2 - 类的构造方法

| 方法名                             | 说明                                                 |
| ---------------------------------- | ---------------------------------------------------- |
| `File (String pathName)`           | 通过给定的路径名字符串转换为File对象                 |
| `File(String parent,String child)` | 从父类的路径名和子类的文件名来创建一个File对象       |
| `File(File parent,String child)`   | 从父类的File目录对象和子类的文件名来创建一个File对象 |

```java
/**
 * @author ly_smith
 * @Description #TODO  File类构造方法
 */
public class Demo03 {
    public static void main(String[] args) {
        //file对象可以理解成是文件描述符，或文件句柄
//        File file01 = new File("./myTest.txt");
        //绝对路劲找到文件
        File file01 = new File("E:/workingspace/bjpn2110/a.txt");
        System.out.println(file01);
        //第一个参数是路径，第二个参数是要操作的具体文件名
        File file02 = new File("./", "myTest.txt");
        System.out.println(file02);
        //第一个参数使用File对象，第二个参数是要操作的具体文件名
        File path = new File("./");
        File file03 = new File(path, "myTest.txt");
        System.out.println(file03);

//        相对路径：相对一当前路径开始找到另一个文件
//                  ./表示当前路径，通过当前文件所在的位置去找另一个文件
//                ../表示返回当前文件所在位置的上一级
//                ../day01/Demo01:表示返回当前文件所在位置的上一级中的day01中的Demo01
//                    ../../  :向上两级，以此类推
//        绝对路径：就是从当前文件所在的磁盘根目录开始找，直到找到文件所在位置
//        例如：E:/workingspace/bjpn2110/a.txt
    }
}
```

### 1.3 - File类的创建功能

| 方法名                    | 说明             |
| ------------------------- | ---------------- |
| `boolean createNewFile()` | 创建文件         |
| `boolean mkdir()`         | 创建目录（单个） |
| `boolean mkdirs()`        | 创建目录（多级） |

```java
/**
 * @author ly_smith
 * @Description #TODO  File类的的创建功能
 */
public class Demo04 {
    public static void main(String[] args) throws IOException {
        File file = new File("./myTest.txt");
        //当文件不存在时，返回true，当文件存在时，则返回false
        if(file.createNewFile()){//创建文件
            System.out.println("文件创建成功！");
        }else {
            System.out.println("文件创建失败！~");
        }
        //创建目录描述符
        File file01 = new File("./myDir");
        if(file01.mkdir()){//创建单个目录
            System.out.println("目录创建成功");
        }else{
            System.out.println("目录创建失败");
        }
        //创建多级目录描述符
        File file02 = new File("./H/E/L/L/O");
        if(file02.mkdirs()){//创建多级目录
            System.out.println("多级目录创建成功");
        }else {
            System.out.println("多级目录创建失败");
        }
    }
}
```

### 1.4 - File类的常用方法

| 方法名                     | 说明                                   |
| -------------------------- | -------------------------------------- |
| `boolean isDirectory()`    | 判断File对象是否是一个目录             |
| `boolean isFile()`         | 判断File对象是否是一个文件             |
| `boolean exists()`         | 判断一个文件或目录是否存在             |
| `String getAbsolutePath()` | 获取File对象的文件的绝对路径           |
| `Stirng getPath()`         | 获取File对象使用的路径与文件名         |
| `String[] list()`          | 获取File对象中的所有文件（String类型） |
| `File[] listFiles()`       | 获取File对象中的所有文件（File类型）   |
| `long lastModify()`        | 获取File对象指向的文件最后被修改的时间 |

```java
/**
 * @author ly_smith
 * @Description #TODO File类的常用方法
 */
public class Demo05 {
    public static void main(String[] args) {
        File file = new File("./");
        File file1 = new File("./a.txt");
        File file2 = new File("./myTest.txt");
        File file3 = new File("./myDir");
        //判断是否是目录
//        System.out.println(file.isDirectory());//true
//        System.out.println(file1.isDirectory());//false
        //判断是否是文件
//        System.out.println(file.isFile());  //false
//        System.out.println(file1.isFile());//true
//        System.out.println(file2.isFile());//true
        //判断文件或目录是否存在
//        System.out.println(file.exists());//true
//        System.out.println(file1.exists());//false
//        System.out.println(file2.exists());//true
//        System.out.println(file3.exists());//true
        //获取绝对路径
//        System.out.println(file.getAbsoluteFile());
//        System.out.println(file1.getAbsoluteFile());
//        System.out.println(file2.getAbsoluteFile());
//        System.out.println(file3.getAbsoluteFile());
        //获取路径和文件信息
//        System.out.println(file.getPath());
//        System.out.println(file1.getPath());
//        System.out.println(file2.getPath());
//        System.out.println(file3.getPath());
        //list（）获取当前目录下的文件和目录
//        String[] list = file.list();
//        for (String name :list ) {
//            System.out.println(name);
//        }
        //获取当前目录下的所有文件和目录的File对象，以便之后的操作
//        File[] files = file.listFiles();
//        for (File name : files) {
//            System.out.println(name);
//        }
        //将long类型的毫秒数转换成date类型的对象
        Date date = new Date(file2.lastModified());
        //将date类型的时间格式化成自定义的时间格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));//将date类型时间格式化输出
    }
}
```

### 1.5 - File类的删除功能

| 方法名             | 说明                 |
| ------------------ | -------------------- |
| `boolean delete()` | 删除文件或目录（空） |

```java
/**
 * @author ly_smith
 * @Description #TODO File类的删除功能
 */
public class Demo06 {
    public static void main(String[] args) {
        //创建文件描述符
//        File file = new File("./myTest.txt");
//        if(file.delete()){//删除文件
//            System.out.println("文件删除成功");
//        }else{
//            System.out.println("文件删除失败");
//        }
//         因为目录中有数据，所以删除不了,需要先将目录中内容清除再删除目录
//        File file = new File("./H");
        File file = new File("./myDir");
        if(file.delete()){
            System.out.println("目录删除成功");
        }else {
            System.out.println("目录删除失败");
        }
    }
}
```

### 课后任务

1、递归实现5的累加和。

















































