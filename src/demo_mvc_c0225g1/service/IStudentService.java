package demo_mvc_c0225g1.service;

import demo_mvc_c0225g1.entity.Student;

public interface IStudentService {

    void add(Student student);

    Student[] findAll();
}
