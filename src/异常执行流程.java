import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 当有多个catch的时候，catch里面的异常等级层层提升
 * 小的类型在前面，大的类型在后面
 *
 */
public class 异常执行流程 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("./a.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();

        }catch (Exception e){
            e.printStackTrace();

        }

    }
}
