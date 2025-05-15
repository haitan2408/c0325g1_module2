package ss3_method;

import ss3_method.common.CheckPrime;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
       for (int i = 2; i <=100; i++) {
           if(CheckPrime.isPrime(i)) {
               System.out.print(i +" ");
           }
       }

    }

}
