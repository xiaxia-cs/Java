import java.util.Random;
import java.util.TreeSet;

public class DoubleBall {

    public static void main(String[] args) {
        Random random = new Random();
        TreeSet<Integer> redBalls = new TreeSet<>();
        //TreeSet是有序的
        while(redBalls.size()<6){
            redBalls.add(random.nextInt(33)+1);
        }
        int blueBall=random.nextInt(16)+1;

        System.out.println("红球："+redBalls+"  篮球：["+blueBall+"]");




    }

}
