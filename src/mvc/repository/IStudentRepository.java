package mvc.repository;

import mvc.entity.Student;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface IStudentRepository {
    List<Student> findAll() throws FileNotFoundException, IOException;
    void add(Student student) throws IOException;
}
