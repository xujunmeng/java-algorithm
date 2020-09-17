package com.lianxi3.seven;

/**
 * Fibonacci数列：如是：[1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]
 *
 *  f(0) = 1; f(1) = 1; f(n) = f(n-1)+f(n-2) n>1;
 * @author james
 * @date 2020/9/16
 */
public class TestMain {

    public static void main(String[] args) {
//        int fibonacci = fibonacci(6);
//        System.out.println(fibonacci);

        for (int i = 0; i < 15; i++) {
            System.out.println(fibonacci(i));
        }

    }

    /**
     * 递归求解n处的值
     */
    private static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (n > 1) {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
        return 0;
    }

}
