package demo_mvc_c0225g1.repository;

import demo_mvc_c0225g1.entity.Student;

public class StudentRepository {
    private Student[] students = new Student[10];
    private int size = 0;

    public void add(Student student) {
        students[size] = student;
        size++;
    }
}
