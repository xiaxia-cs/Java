package 子类重写父类的时候的异常的抛出;

import java.io.FileNotFoundException;
import java.io.IOException;

public class 子类 extends 父类 {

    /**
     * 子类重写父类的方法的时候，子类不可以抛出比父类更大的异常
     * @throws FileNotFoundException
     */
    @Override
    public void show() throws FileNotFoundException {
        try {
            super.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
