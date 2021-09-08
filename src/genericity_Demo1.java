/**
 * 泛型类
 * 泛型描述符可以是任何字符，符合Java的命名规则就可以。但是常用的是大写字母E/K/T/V
 * E-Element:节点，元素
 * T-Type：类型
 * K-Key:键
 * V-Value:值
 */
public class genericity_Demo1<T> {
    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }


}
