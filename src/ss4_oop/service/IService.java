package ss4_oop.service;

import ss4_oop.model.Person;

public interface IService {
    boolean add(Person person);
    boolean delete(int code);
    boolean update(Person person);
    void print();
}
