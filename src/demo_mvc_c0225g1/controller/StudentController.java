package demo_mvc_c0225g1.controller;

import demo_mvc_c0225g1.entity.Student;
import demo_mvc_c0225g1.service.IStudentService;
import demo_mvc_c0225g1.service.StudentService;

public class StudentController {

//     DI module 4
    private IStudentService studentService = new StudentService();

    public void add(Student student) {
        studentService.add(student);
    }

}
