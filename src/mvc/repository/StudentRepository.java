package mvc.repository;

import mvc.entity.Student;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private static List<Student> studentList = new LinkedList<>();
    static {
        studentList.add(new Student(1,"chánh","ĐN",3,"C03"));
        studentList.add(new Student(2,"chiến","ĐN",8,"C03"));
        studentList.add(new Student(3,"tâm","TH",7,"C03"));
    }
    @Override
    public List<Student> findAll() {
        // sau nay đọc ghi file

        return studentList;
    }

    @Override
    public void add(Student student) {
           studentList.add(student);
    }
}
