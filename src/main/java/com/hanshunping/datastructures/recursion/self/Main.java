package com.hanshunping.datastructures.recursion.self;

/**
 * Created by jgsoft on 2020/5/16.
 */
public class Main {

    public static void main(String[] args) {

        test(4);

//        int factorial = factorial(3);
//        System.out.println(factorial);
    }

    public static void test(int n) {
        if (n > 2) {
            test(n - 1);
        }
        System.out.println("n = " + n);
    }

    public static void test1(int n) {
        if (n > 2) {
            test1(n - 1);
        } else {
            System.out.println("n = " + n);
        }
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }

}
