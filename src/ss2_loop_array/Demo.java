package ss2_loop_array;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
//        int[] arr = {2,5,0,1,6,7,4};
////        stream => lambda ->
////        Tìm hiểu Arrays
//
//        System.out.println(sum(arr));
//        for (int temp: arr) {
//
//        }

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int sum = 0;

        for (int[] row : matrix) {

            for (int num : row) {

                sum += num;

                if (num == 5) {

                    break;

                }

            }

        }

        System.out.println(sum);
    }

    public static int sum(int[] arr) {
        int sum =0;
        for (int a: arr) {
            sum +=a;
        }
        return sum;
    }
}
