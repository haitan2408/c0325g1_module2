package demo_mvc_c0225g1.view;

import demo_mvc_c0225g1.controller.StudentController;
import demo_mvc_c0225g1.entity.Student;

import java.util.Scanner;

public class StudentView {
    private static StudentController studentController = new StudentController();

    public static void displayMenuStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------");
        System.out.println("Quản lý học sinh");
        System.out.println("1. Danh sách học sinh");
        System.out.println("2. Thêm mới học sinh");
        System.out.println("3. Sửa học sinh");
        System.out.println("4. Xóa học sinh");
        System.out.println("5. Quay lại menu chính");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 2:
                Student student = inputStudent();
                studentController.add(student);
                System.out.println("Thêm mới thành công");
                break;


        }
    }

    private static Student inputStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã:");
        long code = Long.parseLong(scanner.nextLine());

        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();

        System.out.print("Nhập địa chỉ: ");
        String address = scanner.nextLine();

        System.out.print("Nhập điểm: ");
        int point = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập tên lớp: ");
        String className = scanner.nextLine();
        return  new Student(code,name,address,point,className);
    }
}
