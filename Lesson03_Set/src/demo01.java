import java.util.HashSet;
import java.util.Set;

/***
 * set集合，用于证明set集合没有读写顺序
 *          没有重复值
 *
 * 
*/
public class demo01 {
    public static void main(String[] args) {
        HashSet<Object> set = new HashSet<>();
        set.add("first");
        set.add("second");
        set.add("third");
        set.add("first");
        System.out.println(set);

    }
}
