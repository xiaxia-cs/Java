/**
 * 用于垃圾回收机制
 *  finalize method already deprecated
 */
public class finalizeDemo {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("我是垃圾回收机制的方法");
        super.finalize();
    }

    public static void main(String[] args) {
        Student student = new Student();
        student=null;
        System.gc();
    }
}
