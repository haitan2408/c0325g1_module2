package mvc.service;

import mvc.entity.Student;
import mvc.repository.IStudentRepository;
import mvc.repository.StudentRepository;

import java.util.List;

public class StudentService implements IStudentService {
    private IStudentRepository studentRepository = new StudentRepository();
    @Override
    public List<Student> findAll() {

        return studentRepository.findAll();
    }
    @Override
    public void add(Student student) {

        studentRepository.add(student);
    }
}
