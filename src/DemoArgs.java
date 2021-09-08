/***
 * 可变长参数的底层就是数组
 * 注意可变长参数的传参形式
 */
public class DemoArgs {
    public static int sum(int...a){
        int sum=0;
        for (int i = 0; i <a.length ; i++) {
            sum+=a[i];

        }
        return sum;

    }

    public static void main(String[] args) {
        int a[]=new int[5];
        a[0]=1;
        a[2]=2;
        a[1]=0;
        a[3]=3;
        a[4]=4;
        System.out.println(sum(1,2,3,4));
        System.out.println(sum(1));
        System.out.println(sum(a));
    }





}
