package mvc.service;

import mvc.entity.Student;
import mvc.repository.IStudentRepository;
import mvc.repository.StudentRepository;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class StudentService implements IStudentService {
    private IStudentRepository studentRepository = new StudentRepository();
    private static StudentService instance;

    public static StudentService getInstance() {
        if(instance == null) {
            instance = new StudentService();
        }
        return instance;
    }

    private StudentService() {

    }
    @Override
    public List<Student> findAll() {

        try {
            return studentRepository.findAll();
        } catch (FileNotFoundException e) {
            System.out.println("Khong tim thay file");
        } catch (IOException e) {
            System.out.println("Loi doc du lieu");
        }
        return null;
    }

    @Override
    public void add(Student student) {
        try {
            studentRepository.add(student);
        } catch (IOException e) {
            System.out.println("Loi doc ghi file");

        }

    }
}
