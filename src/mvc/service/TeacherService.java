package mvc.service;

import mvc.entity.Teacher;

import java.util.List;

public class TeacherService implements ITeacherService {

    private static TeacherService instance;

    public static TeacherService getInstance() {
        if (instance == null) {
            instance = new TeacherService();
        }
        return instance;
    }

    private TeacherService(){}
    @Override
    public List<Teacher> findAll() {
        return List.of();
    }

    @Override
    public void add(Teacher student) {

    }
}
