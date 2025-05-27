package ss4_oop.service;

import ss4_oop.model.Person;
import ss4_oop.model.Student;

public class StudentService implements IStudentService{
    @Override
    public void study(Student s) {

    }

    @Override
    public void pay(Student s) {

    }

    @Override
    public boolean add(Person s) {

        Student student = (Student) s;
        return false;
    }

    @Override
    public boolean delete(int code) {
        return false;
    }

    @Override
    public boolean update(Person person) {
        Student student = (Student) person;
        return false;
    }

    @Override
    public void print() {

    }
}
