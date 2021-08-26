import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 注意迭代器的写法
 */
public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");

        //迭代器的写法
        Iterator<String> it=strings.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
