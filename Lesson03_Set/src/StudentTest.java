import java.util.HashSet;

public class StudentTest {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("andy",19));
        students.add(new Student("amy",15));
        students.add(new Student("june",10));
        students.add(new Student("lucy",20));

        System.out.println(students);

    }
}
