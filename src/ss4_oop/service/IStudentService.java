package ss4_oop.service;

import ss4_oop.model.Student;

public interface IStudentService extends IService{
    void study(Student s);
    void pay(Student s);
}
