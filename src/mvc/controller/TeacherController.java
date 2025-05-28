package mvc.controller;

import mvc.service.ITeacherService;
import mvc.service.TeacherService;

import java.util.Scanner;

import static mvc.utils.ConstantMenu.ADD;
import static mvc.utils.ConstantMenu.DISPLAY;

public class TeacherController {
    private ITeacherService teacherService = new TeacherService();
    private Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        boolean flag = true;
        while (flag) {
            System.out.println("Quản lý giáo viên:\n" +
                    "1. Danh sách\n" +
                    "2. Thêm mới\n" +
                    "3. Xoá\n" +
                    "4. Tìm kiếm\n" +
                    "5. Thoát\n");
            System.out.println("Chọn chức năng: \n");
            int choose = 0;
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Phải nhập số nguyên và lớn hơn 0");
            }
            switch (choose) {
                case DISPLAY:
                    break;
                case ADD:

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
