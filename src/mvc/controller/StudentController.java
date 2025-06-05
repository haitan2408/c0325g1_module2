package mvc.controller;

import mvc.entity.Student;
import mvc.service.IStudentService;
import mvc.service.ServiceFactory;
import mvc.service.StudentService;
import mvc.view.CommonView;
import mvc.view.StudentView;

import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.Scanner;

import static mvc.utils.ConstantMenu.ADD;
import static mvc.utils.ConstantMenu.DISPLAY;

public class StudentController {
    private IStudentService studentService = (IStudentService) ServiceFactory.getService("student");
    private Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        boolean flag = true;
        while (flag) {
            System.out.println("Quản lý sinh viên:\n" +
                    "1. Danh sách\n" +
                    "2. Thêm mới\n" +
                    "3. Xoá\n" +
                    "4. Tìm kiếm\n" +
                    "5. Thoát\n");
            System.out.println("Chọn chức năng: \n");
            int choose = CommonView.inputInteger();
            switch (choose) {
                case DISPLAY:
                    // danh sách (gọi dữ liệu từ service => hiển thị
                    List<Student> studentList = studentService.findAll();
                    StudentView.display(studentList);
                    break;
                case ADD:
                    // thêmm ới
                    // hiển thị form thêm dữ liệu => gọi service để them mơ
                    Student student = StudentView.inputData();
                    studentService.add(student);
                    System.out.println("Thêm mới thành công");
                    break;
                case 3:
                    // xoá
                    break;
                case 4:
                    // tìm kiếm
                    break;
                case 5:
                    flag = false;
                default:
                    System.out.println("Nhập lựa chọn đúng theo menu");
            }
        }
    }
}
