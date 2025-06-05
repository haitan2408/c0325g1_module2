package demo_mvc_c0225g1.view;

import java.util.Scanner;

public class MainView {
    public static int displayMainView() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chương trình quản lý CodeGym");
        System.out.println("1. Quản lý học sinh");
        System.out.println("2. Quản lý giáo viên");
        System.out.println("3. Quản lý nhân viên");

        System.out.print("Mời bạn nhập lựa chọn: ");
        int choice = Integer.parseInt(scanner.nextLine());
        return choice;
    }
}
