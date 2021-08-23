import java.util.ArrayList;
import java.util.Scanner;

public class Stucontroller {
    public static void action(int a, ArrayList<Student> student) {
        switch (a){
            case 0:
                System.out.println("*****您已退出学生管理系统*****");
                System.exit(0);
                break;
            case 1:
                System.out.println("*****进入查询模块*****");
                //进入二级查询页面
                int b=StuPage.getQuaryNum();
                StuUtil.SecondQuaryAction(b,student);

                break;
            case 2:
                System.out.println("*****进入添加模块*****");
                StuUtil.addnew(student);
                break;
            case 3:
                System.out.println("*****进入删除模块(根据id删除)*****");
                ArrayList<Student> list=StuUtil.delStubyId(student);


                break;
            case 4:
                System.out.println("*****进入更改模块（根据id更改）*****");
                StuUtil.updateById(student);
                break;



        }
    }




}
