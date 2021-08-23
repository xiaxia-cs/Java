import java.util.ArrayList;

public class Stumain {
    public static void main(String[] args) {
        //1.初始化学生类的Arraylist
        ArrayList<Student> student = new ArrayList<>();
        StuUtil.initInfo(student);

        while (true){
            //2.呈现欢迎界面,并且得到将要执行的功能序号
            int a=StuPage.welcome();

            //3.执行相应的功能
            Stucontroller.action(a,student);

        }


    }
}
