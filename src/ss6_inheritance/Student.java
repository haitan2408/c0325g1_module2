package ss6_inheritance;

public class Student {
    private String name;

    @Override
    public boolean equals(Object obj) {
        Student student = (Student) obj;
        return this.name.equals(student.name);
    }

    public Student(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student st1 = new Student("haiTT");
        Student st2 = new Student("haiTT");
        System.out.println(st1.equals(st2));
    }
}
