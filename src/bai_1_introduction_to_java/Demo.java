package bai_1_introduction_to_java;


import java.util.Scanner;

public class Demo {
//    public: access modifiers (bài 5)
//    static: bài 5
//    void: hàm

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        String a  = scanner.nextLine();
        System.out.println("Hello World!");
        System.out.println("Hi");
        int num = (int)50000000000000l; // ép kiểu tường minh (có thể gây mất mát dữ liệu)
        long num2 = 5; // ép kiểu ngầm định
        float num3 = 0.5f;
        num2 = (int)num3;
        byte b = 127;
        System.out.println(num);

    }
}
