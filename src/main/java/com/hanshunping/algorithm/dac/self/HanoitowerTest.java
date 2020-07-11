package com.hanshunping.algorithm.dac.self;

/**
 * Created by jgsoft on 2020/7/11.
 */
public class HanoitowerTest {

    /**
     * 汉诺塔的移动的方法
     * 使用分治算法
     */
    public static void hanoiTower(int num, char a, char b, char c) {
        //1）如果只有一个盘子
        if (num == 1) {
            System.out.println("第1个盘从 " + a + " -> " + c);
        } else {
            /**
             * 2）如果我们有n>=2，我们总是可以看做是两个盘
             * 一个是最下边的一个盘；
             * 另一个是上面的所有盘；
             *
             * 第一步：先把最上面的盘A->B, 移动过程会使用到c
             */
            hanoiTower(num - 1, a, c, b);

            //第二步：把最下边的盘A->C
            System.out.println("第 " + num + "个盘从" + a + " -> " + c);

            //第三步：把B塔的所有盘B->C，移动过程使用到A
            hanoiTower(num - 1, b, a, c);
        }
    }

}
