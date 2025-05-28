package mvc.view;

import java.util.Scanner;

public class CommonView {

    public static int inputInteger() {
        Scanner scanner = new Scanner(System.in);
        int choose;
        while (true) {
//            try with resources
            try {
                choose = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Phải nhập số nguyên và lớn hơn 0");
            } catch (Exception e) {

            } finally {

            }
        }
            return choose;
    }
}
