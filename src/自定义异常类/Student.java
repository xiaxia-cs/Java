package 自定义异常类;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age)  {
        //调用方法赋值
        try {
            setAge(age);
        } catch (AgeException e) {
            e.printStackTrace();
        }
        try {
            setName(name);
        } catch (NameException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) throws NameException {
        if(name.length()>=2&&name.length()<=4){
            this.name = name;
        }else {
            throw new NameException("名字必须是2-4个字符之间");

        }


    }

    public void setAge(int age) throws AgeException {
        if(age>=0&&age<=120){
            this.age = age;
        }else{
            throw new AgeException("您输入的年龄不合理");
            //System.out.println("您输入的年龄不合理");
        }





    }
}
