import java.util.Random;

/**
 * 数组版双色球
 * 冒泡排序（要记住，一分钟内要完成这个排序）
 *
 * 两种交换算法 异或等于和中间变量算法
 *      异或交换算法
 *          a^=b;
 *          b^=a;
 *          a^=b;
 */
public class DoubleBall02 {
    public static void main(String[] args) {

        Random random = new Random();

        //1.蓝色双色球
        int blueBall=random.nextInt(16)+1;

        //2.数组存储红色双色球
        int [] redBalls=new int[6];

        //3.生成红色双色球
        for (int i = 0,j=0; i <6 ; i++) {
            int number=random.nextInt(33)+1;
            for (j = 0; j <i; j++) {
                if (number==redBalls[j]) {
                    i--;
                    break;
                }
            }
            if (j>=i){
                redBalls[i]=number;
            }


        }
        //3.红球排序，此处用冒泡排序
        for (int i = 0; i <redBalls.length -1; i++) {
            for (int j = 0; j < redBalls.length-1-i; j++) {
                if (redBalls[j]>redBalls[j+1]){
                    /**
                     * 第一种异或算法
                     *     redBalls[j]^=redBalls[j+1];
                     *     redBalls[j+1]^=redBalls[j];
                     *     redBalls[j]^=redBalls[j+1];
                     */

                    int t=redBalls[j];
                    redBalls[j]=redBalls[j+1];
                    redBalls[j+1]=t;


                }

            }

        }

        //4.输出红球和篮球
        System.out.print("红球：");
        for(Integer num:redBalls){
            System.out.print(num+"|");
        }
        System.out.print(" 蓝球："+blueBall);

    }




}
