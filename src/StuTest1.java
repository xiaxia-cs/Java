import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class StuTest1 {
    public static void main(String[] args) {
        TreeSet<Student> student = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num=o1.getAge()-o2.getAge();
                return num==0 ? o1.getName().compareTo(o2.getName()):num;

            }
        }


        );
        student.add(new Student("Mary",15));
        student.add(new Student("Lucy",2));
        student.add(new Student("Bob",50));

        for(Student stu:student){
            System.out.println(stu);
        }




    }
}
