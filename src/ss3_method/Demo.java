package ss3_method;

import ss3_method.common.Prime;

public class Demo {
    public static void main(String[] args) {
        int num = 100;
        checkPrime(num);

    }

    public static void checkPrime(int num) {
        for (int i = 2; i <= num; i++) {
            if(Prime.isPrime(i)) {
                System.out.print(i +" ");
            }
        }
    }

}
