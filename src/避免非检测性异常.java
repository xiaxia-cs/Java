import java.io.IOException;

public class 避免非检测性异常 {
    public static void main(String[] args) {
        int a=10;
        int b=0;

        try {
            System.out.println(a/b);

        }catch (ArithmeticException e){
            System.out.println("被除数不能为0");
            e.printStackTrace(); //用来打印异常路径

            System.out.println("0不能作为除数");


        }

        Exception exception = new Exception();
        if(exception instanceof IOException){  //instanceof 用于判断是否是后面一个类型的子类
            IOException io=(IOException)exception;

        }

        //正则表达式
        String s2="123asd0";
        if(s2.matches("\\d+"));{
            System.out.println(Integer.parseInt(s2));
        }



    }
}
