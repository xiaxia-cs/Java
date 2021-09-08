public class genericity_interface_impl<T> implements genericity_interface<T>{
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
