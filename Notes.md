# NOTES
1. 只有Arraylist才有索引，Set是没有索引的
2. List：
    1.是有序集合（读写顺序一致，怎么存的，就怎么输出），list也被称之为序列
    2.可重复，可以存储重复的值
    3.有索引，可以通过普通的for循环对其进行遍历
3.并发性修改异常
不知读者在Java开发的过程中有没有遇到类似的异常信息 Exception in thread "main" java.util.ConcurrentModificationException, 下面小编简单介绍异常原因以及这种异常的改进方法，内容很简单，有什么问题还望指正。
假设我们要实现这样一个例子： 判断集合里面有没有"world"这个元素，如果有，就添加一个"javaee"元素
出现异常的代码如下：
```java
import java.util.ArrayList;
import java.util.Iterator;

public class Test {

    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();

        // 创建并添加元素
        array.add("hello");
        array.add("world");
        array.add("java");
        Iterator it = array.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            if ("world".equals(s)) {
                array.add("javaee");
            }
        }
    }
}
```

1.异常解释

ConcurrentModificationException:当方法检测到对象的并发修改，但不允许这种修改时，抛出此异常。
产生的原因：
迭代器是依赖于集合而存在的，在判断成功后，集合的中新添加了元素，而迭代器却不知道，所以就报错了，这个错叫并发修改异常。
简单描述就是：迭代器遍历元素的时候，通过集合是不能修改元素的。
如何解决呢?
A:迭代器迭代元素，迭代器修改元素
B:集合遍历元素，集合修改元素(普通for)
2.下面用两种方法去解决这个异常

```java
import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();

        // 创建并添加元素
        array.add("hello");
        array.add("world");
        array.add("java");
        // 方式1：迭代器迭代元素，迭代器修改元素
        // 而Iterator迭代器却没有添加功能，所以我们使用其子接口ListIterator
        // ListIterator lit = array.listIterator();
        // while (lit.hasNext()) {
        // String s = (String) lit.next();
        // if ("world".equals(s)) {
        // lit.add("javaee");
        // }
        // }
        // System.out.println("list1:" + array);
        // 方式2：集合遍历元素，集合修改元素(普通for)
         for (int x = 0; x < array.size(); x++) {
         String s = (String) array.get(x);
         if ("world".equals(s)) {
         array.add("javaee");
         }
         }
        
         System.out.println("list2:" + array);

        // 方式3:增强for循环
        // 增强for循环写的话会报同样的错误，因为它本身就是用来替代迭代器的
        // for (String s : array) {
        // if ("world".equals(s)) {
        // array.add("javaee");
        // }
        // }
        // System.out.println("list3:" + array);
    }
}

```
