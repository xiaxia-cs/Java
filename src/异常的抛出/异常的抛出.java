package 异常的抛出;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/***
 * 在某种特殊的场合中，对于某种异常无法直接处理或者不方便处理的时候，可以选择将该异常转义到调用者，这种形式叫做异常的抛出
 */
public class 异常的抛出 {
    //异常的抛出.异常的抛出，可以抛出多个方法
    public static void show() throws FileNotFoundException ,IOException{
        FileInputStream fileInputStream = new FileInputStream("./a.txt");

    }

    /**当抛出多个异常类的时候，小类型放在大类型的前面，但是不绝对，throws 的时候无所谓
     * @param args
     * @throws IOException
     * @throws FileNotFoundException
     * @throws Exception
     */

    /***
     * 一般情况下异常抛出，然后调用的时候进行捕获
     * @param args
     */
    public static void main(String[] args) {
        try {
            异常的抛出.show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
