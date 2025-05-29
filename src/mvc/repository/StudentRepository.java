package mvc.repository;

import mvc.entity.Student;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    @Override
    public List<Student> findAll() throws FileNotFoundException, IOException {
        List<Student> students = new ArrayList<>();
        BufferedReader br = null;
        br = new BufferedReader(new FileReader("src/mvc/data/student.csv"));
        String line;
        String[] tokens;
        while ((line = br.readLine()) != null) {
            tokens = line.split(",");
            students.add(new Student(Long.parseLong(tokens[0]), tokens[1], tokens[2], Float.parseFloat(tokens[3]), tokens[4]));
        }
        br.close();
        return students;
    }

    @Override
    public void add(Student student) throws IOException {
        BufferedWriter bufferedWriter = null;
        bufferedWriter = new BufferedWriter(new FileWriter("src/mvc/data/student.csv", true));
        bufferedWriter.write(toCSV(student));
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    private String toCSV(Student student) {
        return student.getCode() + "," + student.getName() + "," + student.getAddress() + "," + student.getPoint() + "," + student.getClassName();
    }
}
