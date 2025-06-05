package demo_mvc_c0225g1.service;

import demo_mvc_c0225g1.entity.Student;
import demo_mvc_c0225g1.repository.StudentRepository;

public class StudentService implements IStudentService{
    private StudentRepository studentRepository = new StudentRepository();
    @Override
    public void add(Student student) {
//        Kiểm tra xong
        studentRepository.add(student);
    }

    @Override
    public Student[] findAll() {
        return new Student[0];
    }
}
