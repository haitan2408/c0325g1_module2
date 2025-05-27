package ss9_tdd;

import java.math.BigInteger;

public class Demo {

    public static long sum(int a, int b) throws Exception {
        if((long) a + (long)b > Integer.MAX_VALUE) {
            System.out.println("Lỗi, không thể cộng 2 số cho ra kết quả ....");
            throw new Exception("Lỗi");
        }
        return a + b;
    }

    public static void main(String[] args) {
    }
}
