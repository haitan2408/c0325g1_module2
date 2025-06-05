package ss9_tdd;

import java.math.BigInteger;

public class Demo {

    public static int sum(int a, int b) {
        if((long) a + (long)b > Integer.MAX_VALUE || (long)a + (long)b < Integer.MIN_VALUE) {
            throw new ArithmeticException("Lỗi không cộng được");
        }
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(-2147483640, -9));
    }
}
