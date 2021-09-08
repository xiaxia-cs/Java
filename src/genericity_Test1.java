/**
 * 泛型类测试类
 */
public class genericity_Test1 {
    public static void main(String[] args) {
        genericity_Demo1<String> gd1 = new genericity_Demo1<>();
        gd1.setT("这是一个字符串");
        System.out.println(gd1.getT());

        genericity_Demo1<Integer> gd2 = new genericity_Demo1<>();
        gd2.setT(123456);
        System.out.println(gd2.getT());

        genericity_Demo1<Student> gd3 = new genericity_Demo1<>();
        gd3.setT(new Student("Andy",20));
        System.out.println(gd3.getT());


    }


}
