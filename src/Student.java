public class Student {
    //方法一，实现Comparable 接口，重写compareTo方法
    //方法二,见StuTest 类，匿名内部类，实例化Comparator接口
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     * @param o
     * @return int
     *
     *  @Override
     *     public int compareTo(Object o) {
     *         //return 1;//大于1表示按照先后顺序插，后面的在后面
     *         //return 0;//0表示后面插入的和前面的一样，所以只会插入一个
     *         return -1;//表示后面插入的输出的时候排在前面
     *         //这里可以return this.age-o.getAge();
     */





    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
