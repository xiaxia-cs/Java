import java.util.Scanner;

public class StuPage {
    public static int  welcome() {
        System.out.println("*****欢迎使用学生信息管理系统*****");
        System.out.println("*****选1：查询学生*****");
        System.out.println("*****选2：添加学生*****");
        System.out.println("*****选3：删除学生*****");
        System.out.println("*****选4：更改学生*****");
        System.out.println("*****选0：退出学生管理系统*****");
        System.out.println("*****请按数字选择相应的功能****");
        int a;
        do{
            System.out.println("请按数字选择相应的功能");
            Scanner sc=new Scanner(System.in);
            a=sc.nextInt();
        }while (a<0||a>4);
        return a;

    }

    public static int getQuaryNum() {

        System.out.println("*****欢迎进入查询模块*****");
        System.out.println("*****选1：根据姓名查询学生*****");
        System.out.println("*****选2：根据年龄查询学生*****");
        System.out.println("*****选3：查询全部*****");
        System.out.println("*****选4：返回上一级*****");
        System.out.println("*****选0：退出学生管理系统*****");
        System.out.println("*****请按数字选择相应的功能****");
        int a;
        do{
            System.out.println("请按数字选择相应的功能");
            Scanner sc=new Scanner(System.in);
            a=sc.nextInt();
        }while (a<0||a>6);
        return a;
    }
}
