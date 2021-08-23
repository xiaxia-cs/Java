/**
 * 初始化学生Arraylist
 */

import java.util.ArrayList;
import java.util.Scanner;

public class StuUtil {
    public static int id = 1;

    public static void initInfo(ArrayList<Student> student) {
        student.add(new Student(id++, "张三", "0", 80.5f, 19));
        student.add(new Student(id++, "李四", "1", 90.5f, 19));
        student.add(new Student(id++, "钱五", "1", 77f, 19));
        student.add(new Student(id++, "赵六", "0", 80f, 19));
        student.add(new Student(id++, "刘7", "1", 100f, 19));
        student.add(new Student(id++, "刘7", "0", 99f, 30));


    }

    public static void SecondQuaryAction(int b, ArrayList<Student> student) {
        switch (b) {
            case 0:
                System.out.println("您已退出学生管理系统，欢迎您再次使用");
                System.exit(0);
                break;
            case 1:
                System.out.println("您已进入根据姓名查询学生的模块");
                ArrayList<Student> quaryList = quaryByName(student);
                if (null == quaryList) {
                    System.out.println("没有查询到此学生");
                } else {
                    showAll(quaryList);
                }

                break;
            case 2:
                System.out.println("您已进入根据年龄查询学生的模块");
                ArrayList<Student> quaryList2 = quaryByAge(student);
                if (null == quaryList2) {
                    System.out.println("没有查询到此学生");
                } else {
                    showAll(quaryList2);
                }
                break;


            case 3:
                System.out.println("查看全部");
                showAll(student);
                break;
            case 4:
                System.out.println("您已返回上一级");
                int a = StuPage.welcome();
                Stucontroller.action(a, student);
        }
    }

    private static ArrayList<Student> quaryByAge(ArrayList<Student> student) {
        System.out.println("请输入你要查询的学生年龄");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        ArrayList<Student> Reslist = new ArrayList<>();
        for (Student stu : student) {
            if (age == stu.getAge()) {
                Reslist.add(stu);

            }
        }
        return Reslist;

    }

    private static ArrayList<Student> quaryByName(ArrayList<Student> student) {
        System.out.println("请输入你要查询的学生姓名");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        ArrayList<Student> Reslist = new ArrayList<>();
        for (Student stu : student) {
            if (name.equals(stu.getName())) {
                Reslist.add(stu);

            }
        }
        return Reslist;

    }


    private static void showAll(ArrayList<Student> student) {
        String sex[] = {"boys", "girls"};
        for (Student str : student) {
            System.out.println("id:" + str.getId());
            System.out.println("name:" + str.getName());
            System.out.println("sex:" + sex[Integer.parseInt(str.getSex())]);
            System.out.println("age:" + str.getAge());
            System.out.println("score:" + str.getScore());
            System.out.println("***********");


        }


    }

    public static void addnew(ArrayList<Student> student) {
        id = id++;
        System.out.println("请输入姓名");
        String name = new Scanner(System.in).nextLine();
        System.out.println("请输入性别");
        String sex = new Scanner(System.in).nextLine();
        System.out.println("请输入分数");
        float score = new Scanner(System.in).nextFloat();
        System.out.println("请输入年龄");
        int age = new Scanner(System.in).nextInt();
        student.add(new Student(id, name, sex, score, age));

    }

    public static ArrayList<Student> delStubyId(ArrayList<Student> student) {
        System.out.println("情输入要删除的编号");
        int id = new Scanner(System.in).nextInt();

        for (int i = 0; i < student.size(); i++) {
            if (id == student.get(i).getId()) {
                student.remove(student.get(i));
            }

        }
        return student;
    }

    public static void updateById(ArrayList<Student> student) {
        System.out.println("请输入要修改的编号");
        int id = new Scanner(System.in).nextInt();
        System.out.println("请输入姓名");
        String name = new Scanner(System.in).nextLine();
        System.out.println("请输入性别");
        String sex = new Scanner(System.in).nextLine();
        System.out.println("请输入分数");
        float score = new Scanner(System.in).nextFloat();
        System.out.println("请输入年龄");
        int age = new Scanner(System.in).nextInt();

        student.get(id-1).setName(name);
        student.get(id-1).setSex(sex);
        student.get(id-1).setScore(score);
        student.get(id-1).setAge(age);
        }

    }


//student.add(new Student(id++, "刘7", "0", 99f, 30));