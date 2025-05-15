package ss4_oop.model;

import java.time.LocalDate;
import java.util.Arrays;

public class Student extends Person {

    private float point;

    private String className;

    public Student() {
        super();
    }

    public Student(float point, String className) {
        super();
        this.point = point;
        this.className = className;
    }



    public Student(long code, String name, String phoneNumber, LocalDate dob, String address, Boolean gender, float point, String className) {
        super(code, name, phoneNumber, dob, address, gender);
//        => giống this nhưng thay vì gọi các thành phần của lớp hiện tại thì nó sẽ gọi các thành phần của lớp cha gần nó nhất
       this.point = point;
       this.className = className;

    }

    public void eat() {

    }
}
