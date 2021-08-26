import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

/**
 * 一个蓝色球 1-16
 * 六个红色球 1-33
 */
public class DoubleBall01 {
    public static void main(String[] args) {
        Random rm=new Random();

        //1.生成蓝球
        int blueBall= rm.nextInt(16)+1;

        //2.生成红球
        ArrayList<Integer> redBalls = new ArrayList<>();
        while(redBalls.size()<6){
            int number=rm.nextInt(33)+1;
            if (!redBalls.contains(number)){
                redBalls.add(number);
            }
        }
        Collections.sort(redBalls);

        //3.输出红球和篮球
        System.out.print("红球：");
        for(Integer num:redBalls){
            System.out.print(num+"|");
        }
        System.out.print(" 蓝球："+blueBall);


    }
}
