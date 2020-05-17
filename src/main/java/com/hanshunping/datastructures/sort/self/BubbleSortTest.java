package com.hanshunping.datastructures.sort.self;

/**
 * Created by jgsoft on 2020/5/16.
 */
public class BubbleSortTest {

    public static void main(String[] args) {
        int[] val = new int[]{3, 9, -1, 10, 20, 2, 4, 1, -5};
        int[] sort = sort(val);
        for (int i : sort) {
            System.out.println(i);

        }

    }

    public static int[] sort(int[] val) {

        boolean flag = false;//标识标量，表示是否进行过交换

        int size = val.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (val[j] > val[j+1]) {
                    flag = true;
                    int temp = val[j];
                    val[j] = val[j+1];
                    val[j+1] = temp;
                }
            }
            if (!flag) {
                break;
            } else {
                flag = false;//重置flag，进行下次判断
            }
        }
        return val;
    }

}
