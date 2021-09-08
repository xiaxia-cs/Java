/**
 * 泛型接口的测试类
 */
public class genericty_imp_test {

    public static void main(String[] args) {
        genericity_interface_impl<String> gi = new genericity_interface_impl<>();
        gi.show("我是一个字符串");

        /**
         * 匿名内部类的写法
         */
        new genericity_interface_impl<Integer>(){
            @Override
            public void show(Integer integer) {
                System.out.println(integer+1);
            }
        }.show(9527);


    }
}
