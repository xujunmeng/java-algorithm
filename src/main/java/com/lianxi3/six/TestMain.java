package com.lianxi3.six;

import org.junit.Test;

/**
 *
 * 50. Pow(x, n)
 *
 * https://leetcode-cn.com/problems/powx-n/description/
 * @author james
 * @date 2020/9/3
 */
public class TestMain {

    @Test
    public void test() {
        double v = myPow(2.00000, -2);
        System.out.println(v);
    }

    public double myPow(double x, int n) {
        if (n == 1) {
            return x;
        }
        return x * myPow(x, n - 1);
    }

}
