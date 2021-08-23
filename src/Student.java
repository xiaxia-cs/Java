public class Student {
    private int id;
    private String name;
    private String sex;
    private Float score;
    private int age;

    public Student(int id, String name, String sex, Float score, int age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.score = score;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public Float getScore() {
        return score;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public void setAge(int age) {
        this.age = age;

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", score=" + score +
                ", age=" + age +
                '}';
    }
}
