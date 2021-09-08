package 泛型通配符;

import java.util.ArrayList;
import java.util.List;

public class geeric {

    public static void main(String[] args) {
        //? 问号是全类型通配
        List<?> l01 = new ArrayList<Object>();
        List<?> l02 = new ArrayList<String>();
        List<?> l03 = new ArrayList<Number>();
        List<?> l04 = new ArrayList<Double>();

        //上限 ？ extends
        // 指的是最高能实现的是 Number
        List<? extends Number> l05 = new ArrayList<Number>();
        List<? extends Number> l06 = new ArrayList<Integer>();
        List<? extends Number> l07 = new ArrayList<Double>();
        List<? extends Number> l08 = new ArrayList<Float>();


        //下限 ？ super，指的是至少要实现Number
        List<? super Number> l09 = new ArrayList<Number>();
        List<? super Number> l10 = new ArrayList<Object>();



    }
}
